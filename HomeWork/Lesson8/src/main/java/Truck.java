import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Truck extends Terrestrial {
    private int carryingCapacity;

    public Truck(int power, int maxSpeed, int weight, String carBrand, int numberWheels, double fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, carBrand, numberWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double powerKv() {
        double powerKv = super.getPower() * 0.74;
        return powerKv;
    }

    public void checkCargo(int cargo) {
        if (carryingCapacity >= cargo) {
            System.out.println("”Грузовик загружен”");
        } else {
            System.out.println("“Вам нужен грузовик побольше”");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Грузоподъёмность " + carryingCapacity + " Мощность в кВ " + powerKv());
    }
}