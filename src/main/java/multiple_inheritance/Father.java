package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
    default void speak(){
        System.out.println("come to me, children");
    }
}
