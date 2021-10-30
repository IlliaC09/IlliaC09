import lombok.Getter;
import lombok.Setter;

public class SonyLeg implements ILeg {
    @Setter
    @Getter
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
