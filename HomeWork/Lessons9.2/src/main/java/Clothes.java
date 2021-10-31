import lombok.Getter;
import lombok.Setter;

public class Clothes implements IClothes {
    @Getter
    @Setter
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Clothes(IJacket jacket, IPants pants, IShoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Clothes() {

    }

    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public int getPrice() {
        int price = jacket.getPrice() + pants.getPrice() + shoes.getPrice();
        return price;
    }
}

