public final class Ciseaux extends Fighter {

    @Override
    public FightResult Fight(Fighter other) {
        if (other instanceof Ciseaux) return FightResult.EQUALITY;
        if (other instanceof Papier) return FightResult.WIN;
        return FightResult.LOSE;
    }
}
