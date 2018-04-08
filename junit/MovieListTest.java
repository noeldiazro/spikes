import junit.framework.TestCase;

public class MovieListTest extends TestCase {
    public void testEmptyList_SizeIsZero() {
	MovieList emptyList = new MovieList();
	assertEquals(0, emptyList.size());
    }
}
