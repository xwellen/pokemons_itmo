package pokemons;

import ru.ifmo.se.pokemon.Type;
import skills.Boomburst;

public class Vibrava extends Trapinch {

    public Vibrava(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.DRAGON);
        this.addMove(new Boomburst());
        this.setStats(
                50.0d,
                70.0d,
                50.0d,
                50.0d,
                50.0d,
                70.0d
        );
    }

    public Vibrava() {
        this("Vibrava", 1);
    }
}

