package com.stackroute;



class SharedReources{
    public synchronized void printNumbers(int n) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "   Count :  " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
public static class MyRunnableDemo extends Thread{
        SharedReources reources;

    public MyRunnableDemo(SharedReources reources) {
        this.reources = reources;
    }

    @Override
    public void run() {
        reources.printNumbers(5);
        }
    }

    public static void main(String[] args) {
        SharedReources sharedReources = new SharedReources();

       MyRunnableDemo myRunnableDemo = new MyRunnableDemo(sharedReources);
       MyRunnableDemo myRunnableDemo1 = new MyRunnableDemo(sharedReources);
       myRunnableDemo.start();
        myRunnableDemo1.start();




    }
}
