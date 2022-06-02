
public class Person {
    public String name, lastName;
    public int age;


    public String toString() {
        return "name: " + this.name + " lastName: " + lastName + " age: " + age;
    }

    Person(String name, String lastName, int age) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }
}
