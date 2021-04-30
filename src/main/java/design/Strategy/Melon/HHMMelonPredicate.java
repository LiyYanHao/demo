package design.Strategy.Melon;

public class HHMMelonPredicate implements MelonPredicate{
    @Override
    public Boolean test(Melon melon) {
        return "黄河蜜".equalsIgnoreCase(melon.getType());
    }
}
