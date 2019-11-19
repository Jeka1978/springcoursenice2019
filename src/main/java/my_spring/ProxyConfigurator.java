package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object wrapWithProxyIfNeeded(Object t);
}
