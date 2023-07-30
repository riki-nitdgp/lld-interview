package org.coding.systemDesign.vehicleRentalSystem;

import org.coding.systemDesign.vehicleRentalSystem.product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;

    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public Reservation(int reservationId, User user, Date bookingDate, Date dateBookedFrom,
                       Date dateBookedTo, Long fromTimeStamp, Long toTimeStamp,
                       Location pickUpLocation, Location dropLocation, ReservationType reservationType,
                       ReservationStatus reservationStatus, Location location,  Vehicle vehicle) {
        this.reservationId = reservationId;
        this.user = user;
        this.bookingDate = bookingDate;
        this.dateBookedFrom = dateBookedFrom;
        this.dateBookedTo = dateBookedTo;
        this.fromTimeStamp = fromTimeStamp;
        this.toTimeStamp = toTimeStamp;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.reservationType = reservationType;
        this.reservationStatus = reservationStatus;
        this.location = location;
        this.vehicle = vehicle;
    }



}
