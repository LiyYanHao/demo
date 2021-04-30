package design.Strategy.Melon;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public static List<Melon> filterMelonByType(List<Melon> melons, String type) {
        List<Melon> result = new ArrayList<>();
        for (Melon melon : melons) {
            if (melon != null && type.equalsIgnoreCase(melon.getType())) {
                result.add(melon);
            }
        }
        return result;
    }

    /**
     * 按照重量过滤瓜类
     *
     * @param melons
     * @param weight
     * @return
     */
    public static List<Melon> filterMelonByWeight(List<Melon> melons, int weight) {

        List<Melon> result = new ArrayList<>();
        for (Melon melon : melons) {
            if (melon != null && melon.getWeight() == weight) {
                result.add(melon);
            }
        }
        return result;
    }


    public static List<Melon> FilterMelons(List<Melon> melons, MelonPredicate predicate) {
        ArrayList<Melon> result = new ArrayList<>();
        for (Melon melon:melons){
            if(melon!=null && predicate.test(melon)){
                result.add(melon);
            }
        }
        return result;
    }
}
