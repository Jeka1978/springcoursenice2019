package my_spring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        T t = type.newInstance();

        Faker faker = new Faker();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectQuote.class)) {
                String fact = faker.chuckNorris().fact();
                field.setAccessible(true);
                field.set(t,fact);
            }
        }

        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max - min)+min+1;
                field.setAccessible(true);
                field.set(t, value);
            }
        }


        return t;
    }
}




