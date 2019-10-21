package skills;

import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    public ThunderFang() {
        super(Type.ELECTRIC, 65, 95);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect()
                .chance(0.1)
                .turns(-1)
                .condition(Status.PARALYZE)
        );
//Flinch
        p.addEffect(new Effect()
                .chance(0.1)
                .attack(0.0D)
                .turns((int) (Math.random() * 4.0D + 1.0D)));


    }

    @Override
    public String describe() {
        return "Thunder Fang";
    }
}

