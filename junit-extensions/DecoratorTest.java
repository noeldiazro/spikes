import junit.extensions.TestDecorator;
import junit.framework.Test;
import junit.framework.TestResult;

public class DecoratorTest extends TestDecorator {
    public DecoratorTest(Test test) {
	super(test);
    }

    public void run(TestResult result) {
	System.out.println("Decorator...");
	basicRun(result);
    }
}
