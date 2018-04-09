import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {
    public static Test suite() {
	TestSuite allTests = new TestSuite();
	Test test = new DecoratedTest("testMethod");
	Test repeated = new RepeatedTest(test, 5);
	allTests.addTest(new SetupExample(repeated));
	return allTests;
    }
}
