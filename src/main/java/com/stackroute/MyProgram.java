package com.stackroute;

//public class MyProgram {
//    public synchronized void print(){
//for (int i = 0; i <= 5; i++) {
//        System.out.println(Thread.currentThread().getName() + "   Count :  " + i);
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}}
class MyThread extends Thread {

//    MyProgram myProgram;
//    public MyThread(MyProgram myProgram) {
//        this.myProgram = myProgram;
//    }

    public  void run(){
        for (int i = 0; i <= 5; i++) {
        System.out.println(Thread.currentThread().getName() + "   Count :  " + i);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }


    public static void main(String[] args) {
     //   MyProgram program = new MyProgram();
        MyThread myThread = new MyThread();
            MyThread myThread1 = new MyThread();
            myThread.setName("Thread 1");
            myThread.setPriority(3);
            myThread1.setName("Thread 2");
            myThread1.setPriority(9);
            myThread.start();

            myThread1.start();
    }
}
