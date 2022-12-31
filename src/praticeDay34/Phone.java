package praticeDay34;

public class Phone extends Device {

    public Phone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void turnon() {
        System.out.println("Press the power-button to turn on the phone "+getBrand()+" "+getModel());
    }

    @Override
    public void turnoff() {
        System.out.println("Press the power-button to turn off the phone "+getBrand()+" "+getModel());
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+" " +getModel()+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" is texting to "+phoneNumber);
    }
}
