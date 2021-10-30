import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Terrestrial extends Transport {
    private int numberWheels; // количество колес
    private double fuelConsumption; // расход

    public Terrestrial(int power, int maxSpeed, int weight, String carBrand, int numberWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, carBrand);
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public void info() {
        super.info();
        System.out.println("Количество колес " + numberWheels + " Расход " + fuelConsumption);
    }
}