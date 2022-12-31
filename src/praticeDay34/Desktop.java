package praticeDay34;

public class Desktop extends Computer implements Downloadable {

    public Desktop(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" downloads from the internet.");
    }
}
