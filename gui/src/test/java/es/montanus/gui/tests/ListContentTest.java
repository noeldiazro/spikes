package es.montanus.gui.tests;

import es.montanus.gui.MovieListEditor;
import es.montanus.gui.MovieListWindow;
import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

import javax.swing.*;
import java.util.Vector;

public class ListContentTest extends TestCase {

    private MockControl control;
    private MovieListEditor editor;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        control = EasyMock.controlFor(MovieListEditor.class);
        editor = (MovieListEditor) control.getMock();
    }

    public void testMovieList() {
        editor.getMovies();
        control.setReturnValue(getMovieNames(), 1);
        control.activate();

        final MovieListWindow window = new MovieListWindow(editor);

        JList list = window.getMovieList();
        assertEquals(2, list.getModel().getSize());
        control.verify();
    }

    private Vector getMovieNames() {
        Vector movieNames = new Vector();
        movieNames.add("Star Wars");
        movieNames.add("Stargate");
        return movieNames;
    }

}
