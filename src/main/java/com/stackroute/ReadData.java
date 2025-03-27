package com.stackroute;

public class ReadData extends Thread{
    String name;
    public ReadData(String name){
        this.name = name;
        setName(this.name);
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Reading Data" + this.name + i);
        }
    }
}
class MoviePlay extends Thread {
    String name;
    public MoviePlay(String name){
        this.name = name;
        setName(this.name);
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Playing Movie" + this.name + i);
        }
    }
}

class PrintData extends Thread {
    String name;
    public PrintData(String name){
        this.name = name;
        setName(this.name);
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Printing Data" + this.name + i);
        }
    }
}

class SampleDemo{
    public static void main(String[] args) {
        ReadData readData = new ReadData("ReadData");
        MoviePlay moviePlay = new MoviePlay("MoviePlay");
        PrintData printData = new PrintData("PrintData");
        readData.start();
        moviePlay.start();
        printData.start();
    }
}
