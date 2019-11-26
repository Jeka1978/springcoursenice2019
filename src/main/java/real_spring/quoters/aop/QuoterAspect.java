package real_spring.quoters.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class QuoterAspect {

    @Around("execution(* real_spring.quoters..*.say*(..))")
    @SneakyThrows
    public Object handleSayMethods(ProceedingJoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("this is quote  "+simpleName+": ");
        Object retVal = jp.proceed();
        return retVal;
    }
}
