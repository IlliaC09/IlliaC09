public class MainHuman {
    public static void main(String[] args) {
        Human human = new Human("Mick", new AdidasJacket(88), new AdidasPants(59), new PumaShoes(60));
        Human human1 = new Human("Leon", new PumaJacket(77), new PumaPants(33), new PumaShoes(29));
        Human human2 = new Human("Alex", new PumaJacket(77), new AdidasPants(13), new AdidasShoes(77));
        Human human3 = new Human("Ignat", new AdidasJacket(88), new AdidasPants(44), new AdidasShoes(12));
        System.out.println(human.getName());
        human.putOn();
        System.out.println(human1.getName());
        human1.putOn();
        System.out.println(human2.getName());
        human2.putOn();
        System.out.println(human3.getName());
        human3.putOn();
    }

}
