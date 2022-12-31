package praticeDay34;

public class DeviceShop {
    public static void main(String[] args) {

    Iphone iphone1 = new Iphone("Apple", "Xr", "Large",700,"Red");
    iphone1.downloadApp();
        System.out.println(iphone1.isHasPowerButton());
        System.out.println(iphone1);
        iphone1.turnoff();
        iphone1.turnon();

        System.out.println("------------------------------------------------------");

        PersonalComputer tablet1 = new PersonalComputer("Samsung", "A8", "Medium", 400, "Rose");

        System.out.println(tablet1);
        System.out.println(tablet1.isHasPowerButton());
        System.out.println(tablet1.isHasBattery());
        tablet1.downloadApp();
        tablet1.turnoff();
        tablet1.turnon();



    }
}
