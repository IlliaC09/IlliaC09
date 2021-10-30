import lombok.Getter;
import lombok.Setter;

public class SamsungHand implements IHand {
    @Getter
    @Setter
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Руки вверх Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
