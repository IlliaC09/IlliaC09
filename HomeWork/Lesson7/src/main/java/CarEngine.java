public class CarEngine {

    private String engineType;
    private boolean engineStarted;
    private int mileage;
    private static final int FixedDistance = 20;

    public CarEngine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void start() {
        if (!engineStarted) {
            System.out.println("Двигатель заведен!");
            engineStarted = true;
        } else {
            System.out.println("Двигатель готов к запуску!");
        }
    }

    public void stop() {
        if (engineStarted) {
            System.out.println("Двигатель остановлен!");
            mileage += FixedDistance;
            engineStarted = false;
        } else {
            System.out.println("Двигатель готов к остановке!");
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public int getMileage() {
        return mileage;
    }
}