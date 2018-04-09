import junit.extensions.TestSetup;
import junit.framework.Test;

public class SetupExample extends TestSetup {
    SetupExample(Test test) {
	super(test);
    }

    @Override protected void setUp() throws Exception {
	super.setUp();
	System.out.println("Setting up global fixture...");
    }

    @Override protected void tearDown() throws Exception {
	super.tearDown();
	System.out.println("Tearing down global fixture...");
    }
}
