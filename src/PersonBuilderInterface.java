public interface PersonBuilderInterface {
    PersonBuilderInterface setName(String name);
    PersonBuilderInterface setSurname(String surname);
    PersonBuilderInterface setAge(int age);
    PersonBuilderInterface setAddress(String city);
    Person build();
}
