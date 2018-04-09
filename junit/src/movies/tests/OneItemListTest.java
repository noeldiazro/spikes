package movies.tests;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class OneItemListTest extends TestCase {
    private List<String> oneItemList;

    @Override protected void setUp() {
	oneItemList = new ArrayList<>();
	oneItemList.add("One");
    }
    
    public void testSize() {
	assertEquals("Size of a one item list should be one.",
		     1,
		     oneItemList.size());
    }

    public void testIsEmpty() {
	assertFalse("One item list should report non-empty.", oneItemList.isEmpty());
    }

    public static void main(String[] args) {
	junit.textui.TestRunner.run(OneItemListTest.class);
    }
}
