package design.Strategy.Melon;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Melon> melons = new ArrayList<>();
        melons.add(new Melon("羊角蜜", 1, "泰国"));
        melons.add(new Melon("西瓜", 2, "三亚"));
        melons.add(new Melon("黄河蜜", 3, "兰州"));
        List<Melon> yjm = Filters.filterMelonByType(melons, "羊角蜜");
        yjm.forEach(melon -> System.out.println("瓜类型:" + melon.getType()));

        List<Melon> melonWeight = Filters.filterMelonByWeight(melons, 3);
        melonWeight.forEach(melon -> {
            System.out.println("瓜重量:" + melon.getWeight());
        });


        //策略模式
        List<Melon> hhm = Filters.FilterMelons(melons, new HHMMelonPredicate());
        List<Melon> weight = Filters.FilterMelons(melons, new WeightMelonPredicate());
        hhm.forEach(h -> System.out.println(h));
        weight.forEach(w -> System.out.println(w));


        //一次性加了100个过滤条件
        List<Melon> melons1 = Filters.FilterMelons(melons, new MelonPredicate() {
            @Override
            public Boolean test(Melon melon) {
                return "europe".equalsIgnoreCase(melon.getOrigin());
            }
        });
        //lambda表达式
        Filters.FilterMelons(melons,melon -> "europe".equalsIgnoreCase(melon.getOrigin()));

    }
}
