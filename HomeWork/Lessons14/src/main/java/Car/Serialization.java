package Car;

import java.io.*;

public class Serialization {

    public boolean serialization(Car car) {
        boolean flag = false;
        File file = new File("C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw4\\output.txt");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(car);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Car deserialization() throws InvalidObjectException {
        File file = new File("C:\\Users\\КОМП\\IdeaProjects\\IlliaC09\\HomeWork\\Lessons14\\src\\main\\resources\\hw4\\output.txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                ois.readObject();
                Car car = (Car) ois.readObject();
                return car;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail");
    }
}
