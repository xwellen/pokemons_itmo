package skills;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, +2));
    }

    @Override
    protected String describe() {
        return "Swagger";
    }
}
