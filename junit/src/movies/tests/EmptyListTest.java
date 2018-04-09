package movies.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;

public class EmptyListTest extends TestCase {
    private List<String> emptyList;
    
    @Override protected void setUp() throws Exception {
	super.setUp();
	emptyList = new ArrayList<>();
    }
    
    public void testSize() {
	assertEquals("Size of an empty list should be zero.",
		     0,
		     emptyList.size());
    }

    public void testIsEmpty() {
	assertTrue("Empty list should report empty.", emptyList.isEmpty());
    }

    public void testIterator() {
	Iterator<String> emptyListIterator = emptyList.iterator();
	assertFalse("Iterator from empty list should be empty.",
		    emptyListIterator.hasNext());
    }

    public static void main(String[] args) {
	junit.textui.TestRunner.run(EmptyListTest.class);
    }
}
