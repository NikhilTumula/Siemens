package upcastingexample;


public class Car extends Vehicle {
    boolean carHasSunroof;
    Sound_System carSoundSystem;


    public Car(String vehicleRegNumber, String vehicleBrand,Category vehicleCategory,String string,Sound_System carSoundSystem, float vehiclePrice, boolean carHasSunroof) {

        super(vehicleRegNumber, vehicleBrand, vehicleCategory, vehiclePrice);

        this.carHasSunroof = carHasSunroof;
        this.carSoundSystem = carSoundSystem;
    }


    @Override
    void calculateRtoTax(){
        System.out.println(this.getVehiclePrice()   *   0.25);
    }
    
}
