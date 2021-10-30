public class Run {
    public static void main(String[] args) {
        Robot robot = new Robot(new ToshibaHead(200), new SamsungHand(500), new SonyLeg(450));
        Robot robot1 = new Robot(new SonyHead(900), new SamsungHand(500), new SonyLeg(450));
        Robot robot2 = new Robot(new SamsungHead(400), new ToshibaHand(600), new ToshibaLeg(300));
        Robot[] robots = new Robot[]{robot, robot1, robot2};
        for (Robot robotMas : robots) {
            robotMas.action();
            System.out.println("------------------------------------------");
        }
        System.out.println(Math.max(Math.max(robot.getPrice(), robot1.getPrice()), robot2.getPrice()));
    }
}


