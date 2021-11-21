package Car;

public class Engine {
    private String type;
    private transient int numberCylinders;

    public Engine(String type, int numberCylinders) {
        this.type = type;
        this.numberCylinders = numberCylinders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", numberCylinders=" + numberCylinders +
                '}';
    }
}




