import lombok.Getter;
import lombok.Setter;

public class SamsungLeg implements ILeg {
    @Setter
    @Getter
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
