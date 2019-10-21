package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Boomburst extends SpecialMove {
    public Boomburst() {
        super(Type.NORMAL, 140, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP,(int) Math.round(v));
    }

    @Override
    public String describe() {
        return "BoomBurst";
    }
}
