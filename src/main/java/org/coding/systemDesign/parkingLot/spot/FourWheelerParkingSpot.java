package org.coding.systemDesign.parkingLot.spot;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(int id) {
        super(id);
    }

    @Override
    public int getPrice(){
        return 80;
    }

    @Override
    public void setPrice(int price){
        this.price = price;
    }

}
