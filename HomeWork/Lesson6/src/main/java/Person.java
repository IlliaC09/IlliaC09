public class Person {
    private String name;
    private int age;
    private String gender;
    private SimpleAddress address;

    public Person(String name, int age, String gender, SimpleAddress address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }


    @Override
    public String toString() {
        return "SimplePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }

    public void info() {
        System.out.printf("Имя: %s \tВозраст: %d \tГендер: %s \t Адрес: %s", name, age, gender, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SimpleAddress getAddress() {
        return address;
    }

    public void setAddress(SimpleAddress address) {
        this.address = address;
    }
}
