import lombok.Getter;
import lombok.Setter;

public class SamsungHead implements IHead {
    @Getter
    @Setter
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
