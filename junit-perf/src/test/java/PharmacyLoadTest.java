package prescriptions.tests;

import com.clarkware.junitperf.LoadTest;
import com.clarkware.junitperf.TimedTest;
import junit.framework.Test;
import junit.framework.TestSuite;

public class PharmacyLoadTest extends TestSuite {
    public static Test suite() {
	Test baseTest = new PharmacyTest("testFindPrescriptions");
	final long maxElapsedTimeInMillis = 1500;
	Test timedTest = new TimedTest(baseTest, maxElapsedTimeInMillis);
	final int concurrentUsers = 10;
	return new LoadTest(timedTest, concurrentUsers);
    }
}
