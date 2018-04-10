package es.montanus.orcs;

public class Player {
    public static final int HIT_THRESHOLD = 13;
    private final Rollable die;
    
    public Player(Rollable die) {
	this.die = die;
    }

    public void attack(Injurable creature) {
	if (isHit())
	    creature.injure(calculateAttackEffect());
    }

    private boolean isHit() {
	return die.roll() >= HIT_THRESHOLD;
    }

    private int calculateAttackEffect() {
	return die.roll();
    }
}
