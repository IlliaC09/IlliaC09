import lombok.Getter;
import lombok.Setter;

public class AdidasJacket implements IJacket {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть куртку Адидас");
    }

    public AdidasJacket(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Адидас");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
