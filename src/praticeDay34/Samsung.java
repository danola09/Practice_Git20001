package praticeDay34;

public class Samsung extends Phone implements Downloadable, AndriodApps {

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }

    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);


    }
}
