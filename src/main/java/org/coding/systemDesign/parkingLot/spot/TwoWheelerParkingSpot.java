package org.coding.systemDesign.parkingLot.spot;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(int id) {
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
