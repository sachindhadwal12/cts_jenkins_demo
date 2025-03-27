package com.stackroute;

public class TicketMaster {
    int ticketCount = 10;
    public void ticketProcess(String type,int qty){
        synchronized (this){
            if(type.equals("Reservation")){
                for(int i=1;i<=qty;i++){
                    ticketCount--;
                    System.out.println("Reservation Happening ,current count is " + ticketCount);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if(type.equals("Cancellation")){
                for(int i=1;i<=qty;i++){
                    ticketCount++;
                    System.out.println("Cancellation Happening, current count is " + ticketCount);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}

class Reservation extends Thread {
    TicketMaster ticketMaster;

    Reservation(TicketMaster  master){
        ticketMaster = master;
    }
    public void run(){
        ticketMaster.ticketProcess("Reservation", 5);
    }
}

class Cancellation extends Thread {
    TicketMaster ticketMaster;

    Cancellation(TicketMaster  master){
        ticketMaster = master;
    }
    public void run(){
        ticketMaster.ticketProcess("Cancellation", 4);
    }
}
class TicketMasterDemo {
    public static void main(String[] args) {
        TicketMaster master = new TicketMaster();
        Reservation reservation = new Reservation(master);
        Cancellation cancellation = new Cancellation(master);
        reservation.start();
        cancellation.start();
    }
}

