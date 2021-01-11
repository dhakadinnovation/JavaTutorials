package com.dhakad.multithreading;

public class ThreadC extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 5;i<10;i++){
            System.out.println("ThreadC : "+i);
          /*  try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA("ThreadA");
        ThreadA threadA1 = new ThreadA("ThreadA1");
        ThreadB threadB = new ThreadB();
        ThreadC threadC = new ThreadC();
        Thread t2 = new Thread(threadB);

        threadA.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);

        threadA.start();
        threadA1.start();
        System.out.println("Threads name : "+threadA1.getName());
       // threadB.run();
       // t2.start();
        threadC.start();

       try {
           threadA1.join();
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
