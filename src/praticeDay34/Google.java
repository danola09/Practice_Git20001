package praticeDay34;

public class Google extends Phone implements Downloadable, AndriodApps {

    public Google(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
