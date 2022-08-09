package upcastingexample;

public class Bike extends Vehicle {

    boolean bikeHasBackRest;
    BikeType bikeType;



    public Bike(String vehicleRegNumber, String vehicleBrand, Category vehicleCategory, float VehiclePrice,boolean bikeHasBackRest, BikeType bikeType) {

        super(vehicleRegNumber, vehicleBrand, vehicleCategory, VehiclePrice);
        this.bikeHasBackRest = bikeHasBackRest;
        this.bikeType = bikeType;
    }



    @Override
    void calculateRtoTax(){

        System.out.println(this.getVehiclePrice()  * 0.1);
    }

    
}