package org.coding.systemDesign.parkingLot;

public class ExitGate {

    Ticket ticket;

    ExitGate(Ticket ticket){
        this.ticket = ticket;
    }

    void exit(){
        generateBill();
        ticket.parkingSpot.removeVehicle();
    }

    private int generateBill(){
        long entryTime = ticket.entryTime;
        long exitTime = System.currentTimeMillis();
        long duration = exitTime - entryTime;
        return (int) ((ticket.parkingSpot.getPrice()/(60*60)) * duration);
    }

}
