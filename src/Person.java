import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected StringBuilder city;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age > -1;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {

        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public StringBuilder getAddress() {
        return city;
    }

    public boolean hasAddress() {
        return city != null;
    }
    public void setAddress(String address) {
        if (hasAddress()) {
            city.replace(0, city.length(), address);
        } else {
            if (address != null) city = new StringBuilder(address);
        }
    }

    public void happyBirthday() {
        age += 1;
    }

    @Override
    public String toString() {
        String tName = name!=null ? "Name: " + name : "Name: неизвестно";
        String tSurname = surname!=null ? "Surname: " + surname : "Surname: неизвестно";
        String tAge = age!=-1 ? "Age: " + age : "Age: неизвестно";
        String tCity = city!=null ? "City: " + city : "City: неизвестно";

        return tName + "\n" +
                tSurname + "\n" +
                tAge + "\n" +
                tCity + "\n";
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder();
    }
}
