package design.Strategy.Melon;

public class WeightMelonPredicate implements MelonPredicate{
    @Override
    public Boolean test(Melon melon) {
        return melon.getWeight() > 1;
    }
}
