package com.stackroute;

public class ThreadDemo extends  Thread{
    public void run(){
        for(int i= 0;i<=5;i++){
            System.out.println(Thread.currentThread().getName() +"   Count :  "+ i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
       ThreadDemo threadDemo = new ThreadDemo();
       ThreadDemo threadDemo1 = new ThreadDemo();
       threadDemo.setName("Thread 1");
       threadDemo1.setName("Thread 2");
       threadDemo.start();
       threadDemo1.start();
    }
}
