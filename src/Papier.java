public final class Papier extends Fighter {

    @Override
    public FightResult Fight(Fighter other) {
        if (other instanceof Papier) return FightResult.EQUALITY;
        if (other instanceof Pierre) return FightResult.WIN;
        return FightResult.LOSE;
    }
}
