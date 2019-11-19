package my_spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectQuote
    private String quote;

    public void clean() {
        System.out.println(quote);
    }
}
