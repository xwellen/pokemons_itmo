package skills;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {
    public Screech() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect()
                .turns(-1)
                .stat(Stat.DEFENSE, -2)
        );
    }

    @Override
    public String describe() {
        return "screech";
    }
}
