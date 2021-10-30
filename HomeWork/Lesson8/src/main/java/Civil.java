import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Civil extends Air {
    private int numberPassengers;
    private boolean businessClass;

    public Civil(int power, int maxSpeed, int weight, String carBrand, int wingspan, int minRunway, int numberPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, carBrand, wingspan, minRunway);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public double powerKv() {
        double powerKv = super.getPower() * 0.74;
        return powerKv;
    }

    public void checkPeople(int people) {
        if (numberPassengers >= people) {
            System.out.println("”Самолет готов к взлёту”");
        } else {
            System.out.println("“Самолет не может перевести столько пассажиров”");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Кол-во пассажиров " + numberPassengers + " Наличие бизнес класса " + businessClass + " Мощность в кВ " + powerKv());
    }
}