package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.RockPolish;
import skills.RockSlide;
import skills.Screech;

public class Onix extends Pokemon {
    public Onix(String name, int level) {
        super(name,level);
        this.setType(Type.ROCK, Type.GROUND);
        this.addMove(new RockPolish());
        this.addMove(new RockSlide());
        this.addMove(new Screech());
        this.setStats(
                35.0d,
                45.0d,
                160.0d,
                30.0d,
                45.0d,
                70.0d
        );
    }

    public Onix() {
        this("Onix", 1);
    }
}
