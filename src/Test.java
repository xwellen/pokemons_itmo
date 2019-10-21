import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Test {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Flygon("GAY", 1);
        Pokemon p2 = new Hawlucha("GAY", 1);
        Pokemon p3 = new Onix("GAY", 1);
        Pokemon p4 = new Steelix("GAY", 1);
        Pokemon p5 = new Trapinch("GAY", 1);
        Pokemon p6 = new Vibrava("GAY", 1);
        new Battle();
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
