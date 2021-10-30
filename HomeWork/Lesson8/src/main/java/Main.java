public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(100, 220, 2510, "Audi", 4, 12.5, "кабриолет", 4);
        Truck truck = new Truck(125, 110, 15000, "Man", 12, 30.8, 50000);
        Civil civil = new Civil(500, 300, 50000, "Boing", 16, 1000, 190, true);
        Military military = new Military(1000, 400, 60000, "AN", 20, 800, true, 12);
        Military military1 = new Military(1000, 800, 10000, "IL", 15, 500, false, 1);
        Transport[] transports = new Transport[]{passenger, truck, civil, military, military1};
        for (Transport transport : transports) {
            transport.info();
            System.out.println("----------------------------------------------------");
        }
        passenger.howManyFuel(3);
        truck.checkCargo(50000);
        civil.checkPeople(100);
        civil.checkPeople(300);
        military1.checkMissiles();
        military1.checkMissiles();
        military1.checkMissiles();
        military.checkBailoutSystem();
        military1.checkBailoutSystem();
    }
}
