import lombok.Getter;
import lombok.Setter;

public class ToshibaHand implements IHand {
    @Getter
    @Setter
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Руки вверх Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
