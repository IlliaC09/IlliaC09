public class Main {
    public static void main(String[] args) {
        GasTank gasTank = new GasTank(50, 100);
        CarEngine carEngine = new CarEngine("V6");
        Car car = new Car(carEngine, gasTank);

        car.stopCar();
        car.getTotalMileage();
        System.out.println();

        car.startCar();
        car.driveCar();
        car.stopCar();
        car.getTotalMileage();
        System.out.println();

        car.startCar();
        car.driveCar();
        car.stopCar();
        car.getTotalMileage();
        System.out.println();

        car.startCar();
        car.startCar();
        car.driveCar();
        car.stopCar();
        car.stopCar();
        car.getTotalMileage();
        System.out.println();

        car.getFuelVolume();
        car.refuelGasTank(25);
        car.getFuelVolume();
        car.getGasTankMaxLimit();
    }
}