package es.montanus.orcs.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {
    public static Test suite() {
	TestSuite tests = new TestSuite();
	tests.addTestSuite(PlayerTest.class);
	tests.addTestSuite(OrcTest.class);
	return tests;
    }
}
