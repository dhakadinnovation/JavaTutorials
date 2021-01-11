package com.dhakad.multithreading;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i = 5;i>0;i--){
            System.out.println("ThreadB : "+i);
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        Thread t1 = new Thread(threadB);
        t1.start();
    }
}
