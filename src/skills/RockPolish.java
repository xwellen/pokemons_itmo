package skills;

import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {
    public RockPolish() {
        super(Type.ROCK, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect()
                .turns(-1)
                .stat(Stat.SPEED, -2)
        );
    }

    @Override
    public String describe() {
        return "Rock Polish";
    }
}
