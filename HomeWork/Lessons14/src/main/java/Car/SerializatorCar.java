package Car;

import java.io.InvalidObjectException;

public class SerializatorCar {

    public static void main(String[] args) throws InvalidObjectException {

        TankFuel tankFuel = new TankFuel("diesel", 100);
        TankFuel tankFuel1 = new TankFuel("petrol", 50);
        TankFuel tankFuel2 = new TankFuel("petrol", 60);
        Engine engine = new Engine("V6", 8);
        Engine engine1 = new Engine("V8", 16);
        Engine engine2 = new Engine("V12", 32);
        Car Audi = new Car("AUDI", engine, tankFuel1, 200, 20000);
        Car BMV = new Car("BMV", engine2, tankFuel2, 250, 40000);
        Car LADA = new Car("LADA", engine, tankFuel, 160, 10000);
        Car Opel = new Car("Opel", engine1, tankFuel, 200, 25000);
        Car GAZ = new Car("GAZ", engine1, tankFuel2, 180, 20000);

        Serialization serialization = new Serialization();
        serialization.serialization(Audi);
        serialization.deserialization();
    }
}
