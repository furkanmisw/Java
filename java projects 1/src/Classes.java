import java.util.ArrayList;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("Furkan", "Simsek", 18);

        ArrayList<Person> arr = new ArrayList<Person>();
        arr.add(person);
        arr.add(person);
        arr.forEach((Person p) -> System.out.println(p.toString()));

        // System.out.println(person.name);
    }
}
