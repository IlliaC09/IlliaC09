import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String carBrand;


    public Transport(int power, int maxSpeed, int weight, String carBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrand = carBrand;
    }

    public void info() {
        System.out.println("Мощность " + power + " Макс скорость " + maxSpeed + " Масса " + weight + " Марка " + carBrand);
    }
}
