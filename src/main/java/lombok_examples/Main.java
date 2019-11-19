package lombok_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().age(12).name("Beni").דג("Tuborg", 3)
                .build();
        System.out.println("person = " + person);
        Person person1 = person.withAge(13);
        System.out.println("person1 = " + person1);
    }
}
