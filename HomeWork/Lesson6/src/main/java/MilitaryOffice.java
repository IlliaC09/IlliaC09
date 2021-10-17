
import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    static ArrayList<Person> persons = new ArrayList<Person>();

    public static void main(String[] args) {

        persons.add(new Person("Дмитрий", 20, "male", new SimpleAddress("Belarus", "Minsk")));
        persons.add(new Person("Дмитрий", 20, "male", new SimpleAddress("Belarus", "Pinsk")));
        persons.add(new Person("Степан", 16, "male", new SimpleAddress("Belarus", "Grodno")));
        persons.add(new Person("Игорь", 30, "male", new SimpleAddress("Belarus", "Minsk")));
        persons.add(new Person("Светлана", 24, "female", new SimpleAddress("Belarus", "Gomel")));
        persons.add(new Person("Иван", 33, "male", new SimpleAddress("Belarus", "Gomel")));
        persons.add(new Person("Борис", 26, "male", new SimpleAddress("Belarus", "Minsk")));
        persons.add(new Person("Руслан", 26, "male", new SimpleAddress("Belarus", "Orsha")));
        persons.add(new Person("Петр", 20, "male", new SimpleAddress("Belarus", "Pinsk")));
        persons.add(new Person("Юлия", 26, "female", new SimpleAddress("Belarus", "Vitebsk")));
        persons.add(new Person("Александр", 22, "male", new SimpleAddress("Belarus", "Minsk")));
        persons.add(new Person("Александр", 20, "male", new SimpleAddress("Belarus", "Pinsk")));
        List<Person> conscript = new MilitaryOffice().getConscript();
        for (Person person : conscript) {
            System.out.println(person.toString());
        }


    }

    public List<Person> getConscript() {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("male")) {
                result.add(person);
            }
        }
        return result;
    }


}
