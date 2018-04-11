package es.montanus.orcs;

public class Orc implements Injurable {
    private int health;
    private final Game game;
    
    public Orc(int initialHealth, Game game) {
	health = initialHealth;
	this.game = game;
    }

    public void injure(int damage) {
	health -= damage;
	if (health <= 0)
	    game.hasDied(this);
    }
}
