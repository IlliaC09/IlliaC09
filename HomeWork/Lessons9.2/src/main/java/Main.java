public class Main {
    public static void main(String[] args) {
        Clothes clothes = new Clothes(new AdidasJacket(30), new PumaPants(80), new AdidasShoes(88));
        Clothes clothes1 = new Clothes(new PumaJacket(39), new PumaPants(15), new PumaShoes(66));
        Clothes clothes2 = new Clothes(new AdidasJacket(95), new AdidasPants(66), new AdidasShoes(33));
        Clothes[] clothesMas = new Clothes[]{clothes, clothes1, clothes2};
        for (Clothes clothesArray : clothesMas) {
            clothesArray.putOn();
            System.out.println(clothesArray.getPrice());
            System.out.println("*******************************");
        }
        for (Clothes clothesArray : clothesMas) {
            clothesArray.takeOff();
            System.out.println("*******************************");
        }
    }
}
