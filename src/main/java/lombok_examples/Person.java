package lombok_examples;

import lombok.*;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    @Singular("דג")
    private Map<String,Integer> fish;

    public Person withName(String name) {
        return this.name == name ? this : new Person(name, this.age, this.fish);
    }

    public Person withAge(int age) {
        return this.age == age ? this : new Person(this.name, age, this.fish);
    }

    public Person withFish(Map<String, Integer> fish) {
        return this.fish == fish ? this : new Person(this.name, this.age, fish);
    }
}
