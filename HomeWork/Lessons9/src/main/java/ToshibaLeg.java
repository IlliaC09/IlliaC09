import lombok.Getter;
import lombok.Setter;

public class ToshibaLeg implements ILeg {
    @Setter
    @Getter
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
