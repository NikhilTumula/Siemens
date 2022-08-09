package upcastingexample;

abstract public class Vehicle {

    String vehicleRegNumber;
    String vehicleBrand;
    Category vehicleCategory;
    float VehiclePrice;


    public Vehicle(String vehicleRegNumber, String vehicleBrand, Category vehicleCategory, float VehiclePrice) {
        this.vehicleRegNumber = vehicleRegNumber;
        this.vehicleBrand = vehicleBrand;
        this.vehicleCategory = vehicleCategory;
        this.VehiclePrice = VehiclePrice;
    }

    public String getVehicleRegNumber() {
        return this.vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public String getVehicleBrand() {
        return this.vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Category getVehicleCategory() {
        return this.vehicleCategory;
    }

    public void setVehicleCategory(Category vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public float getVehiclePrice() {
        return this.VehiclePrice;
    }

    public void setVehiclePrice(float VehiclePrice) {
        this.VehiclePrice = VehiclePrice;
    }

    @Override
    public String toString() {
        return "{" +
            " vehicleRegNumber='" + getVehicleRegNumber() + "'" +
            ", vehicleBrand='" + getVehicleBrand() + "'" +
            ", vehicleCategory='" + getVehicleCategory() + "'" +
            ", VehiclePrice='" + getVehiclePrice() + "'" +
            "}";
    }


    abstract void calculateRtoTax();

}
