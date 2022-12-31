package praticeDay34;

public class Laptop extends Computer implements Downloadable{

    public Laptop(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" downloads from the internet through WIFI.");
    }
}

