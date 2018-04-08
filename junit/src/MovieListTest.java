package movies.tests;

import junit.framework.TestCase;
import movies.MovieList;

public class MovieListTest extends TestCase {
    private MovieList emptyList;
    
    @Override protected void setUp() throws Exception {
	super.setUp();
	emptyList = new MovieList();
    }
    
    public void testEmptyList_SizeIsZero() {
	assertEquals(0, emptyList.size());
    }

    public void testEmptyList_IsEmpty() {
	assertTrue(emptyList.isEmpty());
    }
}
