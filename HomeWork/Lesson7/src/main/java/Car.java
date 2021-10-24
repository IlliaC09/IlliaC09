public class Car {
    private final CarEngine engine;
    private GasTank gasTank;
    private String brand;
    private int releaseYear;


    public Car(CarEngine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void startCar() {
        if (gasTank.canCarStart()) {
            engine.start();
        } else {
            System.out.println("Нет топлива. Заправься");
        }
    }

    public void driveCar() {
        if (engine.isEngineStarted()) {
            System.out.println("Машина едет!");
        } else {
            System.out.println("Нужно старт перед поездкой");
        }
    }

    public void stopCar() {
        engine.stop();
    }

    public void refuelGasTank(int refuelAmount) {
        gasTank.refuel(refuelAmount);
        System.out.println(String.format("Машина запрвлена на %s, В баке: %s", refuelAmount, gasTank.getFuelVolume()));
    }

    public void getFuelVolume() {
        System.out.println("Текущий объем топлива: " + gasTank.getFuelVolume());
    }

    public void getTotalMileage() {
        System.out.println("Пройдено: " + engine.getMileage());
    }

    public void getGasTankMaxLimit() {
        System.out.println("Объем бака: " + gasTank.getGasTankMaxLimit());
    }
}