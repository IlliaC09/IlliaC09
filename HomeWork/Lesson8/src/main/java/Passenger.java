import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Passenger extends Terrestrial {
    private String typeBody;
    private int numberPassengers; // количество пассажиров

    public Passenger(int power, int maxSpeed, int weight, String carBrand, int numberWheels, double fuelConsumption, String typeBody, int numberPassengers) {
        super(power, maxSpeed, weight, carBrand, numberWheels, fuelConsumption);
        this.typeBody = typeBody;
        this.numberPassengers = numberPassengers;
    }

    public double powerKv() {
        double powerKv = super.getPower() * 0.74;
        return powerKv;
    }

    public MyTerrestrialResult howManyFuel(int time) {
        double howManyFuel = getHowManyFuel(time);
        int howManyDistance = super.getMaxSpeed() * time;
        MyTerrestrialResult myTerrestrialResult = new MyTerrestrialResult(howManyFuel, howManyDistance);
        System.out.println("За время " + time + "ч " + "автомобиль " + super.getCarBrand() + " двигаясь с максимальной скоростью " + super.getMaxSpeed() + "км/ч проедет " + howManyDistance + "км и израсходует " + howManyFuel + " литров топлива.");
        return myTerrestrialResult;

    }

    private double getHowManyFuel(int time) {
        return super.getFuelConsumption() * time;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("Тип кузова " + typeBody + " Кол-во пассажиров " + numberPassengers + " Мощность в кВ " + powerKv());
    }


}