package praticeDay34;

public class PersonalComputer extends Computer implements Downloadable {

    public PersonalComputer(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" downloads from the internet through a phone.");
    }
}
