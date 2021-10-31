import lombok.Getter;
import lombok.Setter;

public class PumaPants implements IPants {
    @Getter
    @Setter
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надеть штаны Пума");
    }

    public PumaPants(int price) {
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Пума");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
