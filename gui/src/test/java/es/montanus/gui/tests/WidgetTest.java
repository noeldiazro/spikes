package es.montanus.gui.tests;

import es.montanus.gui.MovieListEditor;
import es.montanus.gui.MovieListWindow;
import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

import javax.swing.JList;

public class WidgetTest extends TestCase {

    private MovieListWindow window;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        window = new MovieListWindow(getEditor());
    }

    private MovieListEditor getEditor() {
        MockControl control = EasyMock.niceControlFor(MovieListEditor.class);
        return (MovieListEditor)control.getMock();
    }

    public void testTitle() {
        assertEquals(MovieListWindow.MOVIES, window.getTitle());
    }

    public void testWindowIsVisible() {
        assertTrue(window.isVisible());
    }

    public void testList() {
        JList movieList = window.getMovieList();
        assertNotNull(movieList);
        assertTrue(window.contains(movieList));
        assertTrue(movieList.isVisible());
    }

}
