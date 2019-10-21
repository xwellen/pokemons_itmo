package skills;

import ru.ifmo.se.pokemon.*;

public class HoneClaws extends StatusMove{
    public HoneClaws(){
        super(Type.DARK, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, +1).stat(Stat.ACCURACY, +1));
    }

    @Override
    protected String describe() {
        return "HoneClaws";
    }
}
