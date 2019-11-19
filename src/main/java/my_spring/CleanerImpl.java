package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public final class CleanerImpl implements Cleaner {

    @InjectQuote
    private String quote;

    @PostConstruct
    public void init() {
        System.out.println("quote = " + quote);
    }

    public void clean() {
        System.out.println(quote);
    }
}
