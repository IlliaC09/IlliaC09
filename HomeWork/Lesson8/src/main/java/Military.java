import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Military extends Air {
    private boolean bailoutSystem;
    private int numberMissiles;

    public Military(int power, int maxSpeed, int weight, String carBrand, int wingspan, int minRunway, boolean bailoutSystem, int numberMissiles) {
        super(power, maxSpeed, weight, carBrand, wingspan, minRunway);
        this.bailoutSystem = bailoutSystem;
        this.numberMissiles = numberMissiles;
    }

    public double powerKv() {
        double powerKv = super.getPower() * 0.74;
        return powerKv;
    }

    public void checkMissiles() {
        if (numberMissiles > 0) {
            System.out.println("“ Ракета пошла...”");
            numberMissiles--;
        } else {
            System.out.println("“Боеприпасы отсутствуют”");
        }
    }

    public void checkBailoutSystem() {
        if (bailoutSystem) {
            System.out.println("“Катапультирование прошло успешно”");
        } else {
            System.out.println("“У вас нет такой системы");

        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Наличие системы катапультирования " + bailoutSystem + " Кол-во ракет на борту " + numberMissiles + " Мощность в кВ " + powerKv());
    }
}