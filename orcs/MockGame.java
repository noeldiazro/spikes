package es.montanus.orcs.tests;

import java.util.ArrayList;
import java.util.Collection;
import es.montanus.orcs.Game;
import es.montanus.orcs.Injurable;

class MockGame implements Game {
    private Collection<Injurable> deaths = new ArrayList<>();

    @Override
    public void hasDied(Injurable creature) {
	deaths.add(creature);
    }

    int getDeathCount() {
	return deaths.size();
    }

    boolean isDead(Injurable creature) {
	return deaths.contains(creature);
    }
}
