package praticeDay34;

public abstract class Device {

    private String brand, model, size;
    private double price;
    private String color;
    public static boolean hasBattery = true, hasPowerButton=true;

    public Device(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
        }

    public void setBrand(String brand) {
        if(brand==null){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        //        ""                 " "
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if(model==null){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        //        ""                 " "
        if(model.isEmpty() || model.isBlank()){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public abstract void turnon();

    public abstract void turnoff();


    public String toString() {
        return getClass().getSimpleName() +"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */