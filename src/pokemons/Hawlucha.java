package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.AerialAce;
import skills.Agility;
import skills.HoneClaws;
import skills.Swagger;

public class Hawlucha extends Pokemon {
    public Hawlucha(String name, int level){
        super(name,level);
        addType(Type.FIGHTING);
        addType(Type.FLYING);
        addMove(new Swagger());
        addMove(new Agility());
        addMove(new HoneClaws());
        addMove(new AerialAce());
        setStats(
                78.0d,
                92.0d,
                75.0d,
                74.0d,
                63.0d,
                118.0d
        );
    }

    public Hawlucha(){
        this("Hawlucha", 1);
    }
}
