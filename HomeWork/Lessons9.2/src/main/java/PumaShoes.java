import lombok.Getter;
import lombok.Setter;

public class PumaShoes implements IShoes {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть обувь Пума");
    }

    public PumaShoes(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Пума");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
