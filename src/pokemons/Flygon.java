package pokemons;


import skills.Facade;

public class Flygon extends Vibrava {
    public Flygon(String name, int level) {
        super(name, level);
        this.addMove(new Facade());
        this.setStats(
                80.0d,
                100.0d,
                80.0d,
                80.0d,
                80.0d,
                100.0d
        );
    }

    public Flygon() {
        this("Flygon", 1);
    }
}
