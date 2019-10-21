package skills;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove{
    public Agility(){
        super(Type.PSYCHIC, 0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPEED, +2));
    }

    @Override
    protected String describe() {
        return "Agility";
    }
}
