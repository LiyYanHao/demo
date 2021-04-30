package design.Strategy.Melon.引入泛型;

import design.Strategy.Melon.Melon;
import design.Strategy.Melon.MelonPredicate;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public static <T> List<T> Filter(List<T> list, Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<>();
        for (T t : list) {
            if (t != null && predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
