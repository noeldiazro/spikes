package prescriptions.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import com.clarkware.junitperf.TimedTest;;

public class PerformanceTest extends TestSuite {
    public static Test suite() {
	TestSuite tests = new TestSuite();
	Test test = new PharmacyTest("testFindPrescriptions");
	final long maxElapsedTimeInMillis = 1500;
	tests.addTest(new TimedTest(test, maxElapsedTimeInMillis));
	return tests;
    }
}
