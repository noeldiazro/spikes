package es.montanus.orcs.tests;

import junit.framework.TestCase;
import es.montanus.orcs.Game;
import es.montanus.orcs.Injurable;
import es.montanus.orcs.Orc;

public class OrcTest extends TestCase {
    private static final int INITIAL_HEALTH = 10;
    private MockGame game;
    private Orc orc;
    
    @Override
    protected void setUp() throws Exception {
	game = new MockGame();
	orc = new Orc(INITIAL_HEALTH, game);
    }
    
    public void testOrcNotKilledAfterOneWeakHit() {
	orc.injure(INITIAL_HEALTH - 1);
	assertEquals(0, game.getDeathCount());
	assertFalse(game.isDead(orc));
    }

    public void testOrcKilledAfterOneStrongHit() {
	orc.injure(INITIAL_HEALTH);
	assertEquals(1, game.getDeathCount());
	assertTrue(game.isDead(orc));
    }

    public void testOrcKilledAfterSeveralInjuries() {
	orc.injure(INITIAL_HEALTH - 1);
	orc.injure(1);
	assertEquals(1, game.getDeathCount());
	assertTrue(game.isDead(orc));
    }
}
