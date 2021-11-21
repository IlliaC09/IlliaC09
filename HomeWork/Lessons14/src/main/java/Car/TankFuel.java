package Car;

public class TankFuel {
    private String typeFuel;
    private int volume;

    public TankFuel(String typeFuel, int volume) {
        this.typeFuel = typeFuel;
        this.volume = volume;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "TankFuel{" +
                "typeFuel='" + typeFuel + '\'' +
                ", volume=" + volume +
                '}';
    }
}
