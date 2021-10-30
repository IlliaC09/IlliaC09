import lombok.Getter;
import lombok.Setter;

public class ToshibaHead implements IHead {
    @Getter
    @Setter
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
