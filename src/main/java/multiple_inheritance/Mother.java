package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {

    default void speak(){

        System.out.println("COME TO ME, CHILDREN!!!");
    }
}
