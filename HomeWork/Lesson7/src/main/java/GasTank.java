public class GasTank {
    private int fuelVolume;
    private final int maxLimit;

    public GasTank(int fuelVolume, int maxLimit) {
        if (fuelVolume > maxLimit) {
            fuelVolume = maxLimit;
        }
        this.fuelVolume = fuelVolume;
        this.maxLimit = maxLimit;
    }

    public int getGasTankMaxLimit() {
        return maxLimit;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void refuel(int refuelAmount) {
        int temp = fuelVolume + refuelAmount;
        if (temp > maxLimit) {
            fuelVolume = maxLimit;
        } else {
            fuelVolume += refuelAmount;
        }
    }

    public boolean canCarStart() {
        return fuelVolume > 0;
    }
}