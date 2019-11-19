package my_spring;

/**
 * @author Evgeny Borisov
 */
public class NiceServiceImpl implements NiceService {
    @Override
    public void doWork() {
        System.out.println("Working");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("W is the best!");
    }
}
