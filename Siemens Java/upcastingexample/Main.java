package upcastingexample;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("MH46BZ4264", "Maruti",Category.CAR, "false", Sound_System.ANDROID_AUTO, 99999, false);
        c1.calculateRtoTax();
    }
    
}
