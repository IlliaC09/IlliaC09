import lombok.Getter;
import lombok.Setter;

public class AdidasPants implements IPants {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть штаны Адидас");
    }

    public AdidasPants(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Адидас");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
