package my_spring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectQuoteAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Faker faker = new Faker();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectQuote.class)) {
                String fact = faker.chuckNorris().fact();
                field.setAccessible(true);
                field.set(t,fact);
            }
        }
    }
}
