package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.Confide;
import skills.RockSlide;

public class Trapinch extends Pokemon {

    public Trapinch(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        this.addMove(new RockSlide());
        this.addMove(new Confide());
        this.setStats(
                45.0d,
                100.0d,
                45.0d,
                45.0d,
                45.0d,
                10.0d
        );
    }

    public Trapinch() {
        this("Trapinch", 1);
    }
}
