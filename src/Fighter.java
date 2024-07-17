public abstract sealed class Fighter permits Pierre, Papier, Ciseaux {
    public abstract FightResult Fight(Fighter other);
}
