package com.dhakad.multithreading;

public class ThreadA extends Thread {

    public ThreadA(String name) {
        System.out.println("Thread Name "+name);
    }


    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("ThreadA : "+i);
            /*try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public static void main(String[] args) {
        ThreadA a = new ThreadA("ThreadA");
        a.start();
    }
}
