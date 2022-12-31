package praticeDay34;

public class Computer extends Device {

    public Computer(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void turnon() {
        System.out.println("Press the power-button to turn on the computer "+getBrand()+" "+getModel());
    }

    @Override
    public void turnoff() {
        System.out.println("Press the power-button to turn off the computer "+getBrand()+" "+getModel());
    }

    public void lid(){
        System.out.println("To use "+getBrand()+" "+getModel()+" you must open lid to use computer.");
    }
}
