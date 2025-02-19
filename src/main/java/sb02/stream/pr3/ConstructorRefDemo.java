package sb02.stream.pr3;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory1 = ((name, age) -> new Person(name, age));
        PersonFactory factory2 = Person::new;

        Person p = factory1.create("Kim",29);

        System.out.println("Created Person: "+p);
    }
}
