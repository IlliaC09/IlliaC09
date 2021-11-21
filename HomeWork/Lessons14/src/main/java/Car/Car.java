package Car;

public class Car {
    private String brand;
    private final Engine engine;
    private TankFuel tankFuel;
    private int speed;
    private int price;

    public Car(String brand, Engine engine, TankFuel tankFuel, int speed, int price) {
        this.brand = brand;
        this.engine = engine;
        this.tankFuel = tankFuel;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public TankFuel getTankFuel() {
        return tankFuel;
    }

    public void setTankFuel(TankFuel tankFuel) {
        this.tankFuel = tankFuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
