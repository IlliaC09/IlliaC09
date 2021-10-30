import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Air extends Transport {
    private int wingspan; // крылья
    private int minRunway; // длина полосы

    public Air(int power, int maxSpeed, int weight, String carBrand, int wingspan, int minRunway) {
        super(power, maxSpeed, weight, carBrand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    public void info() {
        super.info();
        System.out.println("Размах крыльев " + wingspan + " Мин длина полосы " + minRunway);
    }
}