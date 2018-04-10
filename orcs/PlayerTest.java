package es.montanus.orcs.tests;

import junit.framework.TestCase;
import es.montanus.orcs.Player;
import es.montanus.orcs.Rollable;
import es.montanus.orcs.Injurable;

public class PlayerTest extends TestCase {
    private Player player;
    private FakeInjurable injurable;
    private FakeRollable rollable;
    
    @Override
    protected void setUp() throws Exception {
	super.setUp();
	injurable = new FakeInjurable();
    }
    
    public void testMissedAttack() {
	rollable = new FakeRollable(Player.HIT_THRESHOLD - 1);
	player = new Player(rollable);
	
	player.attack(injurable);
	
	assertEquals(1, rollable.getRolledCount());
	assertEquals(0, injurable.getInjuredCount());
    }

    public void testHitAttack() {
	rollable = new FakeRollable(Player.HIT_THRESHOLD);
	player = new Player(rollable);

	player.attack(injurable);
	
	assertEquals(2, rollable.getRolledCount());
	assertEquals(1, injurable.getInjuredCount());
    }
    
    private class FakeRollable implements Rollable {
	private final int fixedRoll;
	private int rolledCount = 0;
	
	FakeRollable(int fixedRoll) {
	    this.fixedRoll = fixedRoll;
	}
	
	@Override
	public int roll() {
	    rolledCount++;
	    return fixedRoll;
	}

	int getRolledCount() {
	    return rolledCount;
	}
    }

    private class FakeInjurable implements Injurable {
	private int injuredCount = 0;
	
	@Override
	public void injure(int effect) {
	    injuredCount++;
	}

	int getInjuredCount() {
	    return injuredCount;
	}
    }  
}
