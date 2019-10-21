package skills;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.addEffect(new Effect()
                .chance(0.3)
                .turns(-1)
                .condition(Status.NORMAL)
        );
    }
    @Override
    public String describe(){
        return "Rock Slide";
    }
}
