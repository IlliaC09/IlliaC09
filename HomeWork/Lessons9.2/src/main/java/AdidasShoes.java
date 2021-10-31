import lombok.Getter;
import lombok.Setter;

public class AdidasShoes implements IShoes {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть обувь Адидас");
    }

    public AdidasShoes(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Адидас");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
