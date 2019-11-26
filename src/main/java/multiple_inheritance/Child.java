package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Child implements Mother,Father {

    @Override
    public void speak() {
        Mother.super.speak();
        Father.super.speak();
        System.out.println(1234);
    }
}
