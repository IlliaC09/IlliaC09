import lombok.Getter;
import lombok.Setter;

public class Human extends Clothes {

    @Getter
    @Setter
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;


    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
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
