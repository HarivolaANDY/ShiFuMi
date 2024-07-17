public final class Pierre extends Fighter {

    @Override
    public FightResult Fight(Fighter other) {
        if (other instanceof Pierre) return FightResult.EQUALITY;
        if (other instanceof Ciseaux) return FightResult.WIN;
        return FightResult.LOSE;
    }
}
