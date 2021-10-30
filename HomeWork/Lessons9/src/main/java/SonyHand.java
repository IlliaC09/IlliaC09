import lombok.Getter;
import lombok.Setter;

public class SonyHand implements IHand {
    @Getter
    @Setter
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Руки вверх Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
