package design.Strategy.Melon.引入泛型;

import design.Strategy.Melon.Melon;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Melon> melons = new ArrayList<>();
        melons.add(new Melon("羊角蜜", 1, "泰国"));
        melons.add(new Melon("西瓜", 2, "三亚"));
        melons.add(new Melon("黄河蜜", 3, "兰州"));
        List<Melon> filter = Filters.Filter(melons, melon -> "羊角蜜".equals(melon.getType()));
        filter.forEach(melon -> System.out.println(melon));
    }
}
