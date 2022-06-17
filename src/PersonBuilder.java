public class PersonBuilder implements PersonBuilderInterface {
    private String name;
    private String surname;
    private int age;
    private String city;


    @Override
    public PersonBuilderInterface setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilderInterface setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilderInterface setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilderInterface setAddress(String city) {
        this.city = city;
        return this;
    }

    @Override
    public Person build() {
        try {
            Person person = new Person(name, surname, age);
            person.setAddress(city);
            return person;
        } catch (IllegalArgumentException ex) {
            System.out.println("Ведены неверные данные");
        }
        return null;
    }
}
