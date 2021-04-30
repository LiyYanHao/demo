package design.Strategy.Melon.引入泛型;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
