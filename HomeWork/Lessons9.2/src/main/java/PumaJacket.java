import lombok.Getter;
import lombok.Setter;

public class PumaJacket implements IJacket {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть куртку Пума");
    }

    public PumaJacket(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Пума");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
