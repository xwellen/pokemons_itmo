package pokemons;

import ru.ifmo.se.pokemon.Type;
import skills.ThunderFang;

public class Steelix extends Onix {
    public Steelix(String name, int level) {
        super(name,level);
        this.setType(Type.STEEL, Type.GROUND);
        this.addMove(new ThunderFang() );
        this.setStats(
                75.0d,
                85.0d,
                200.0d,
                55.0d,
                65.0d,
                30.0d
        );
    }

    public Steelix() {
        this("steelix", 1);
    }
}
