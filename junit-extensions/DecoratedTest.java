import junit.framework.TestCase;

public class DecoratedTest extends TestCase {
    public DecoratedTest(String name) {
	super(name);
    }

    @Override protected void setUp() throws Exception {
	super.setUp();
	System.out.println("\nlocal setUp");
    }
    
    public void testMethod() {
	System.out.println("testMethod");
    }

    @Override protected void tearDown() throws Exception {
	super.tearDown();
	System.out.println("local tearDown");
    }
}
