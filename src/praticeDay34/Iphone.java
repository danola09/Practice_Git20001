package praticeDay34;

public class Iphone extends Phone implements Downloadable, AppleApps {

    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
