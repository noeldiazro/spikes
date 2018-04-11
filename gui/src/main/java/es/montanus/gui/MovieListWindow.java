package es.montanus.gui;

import javax.swing.*;
import java.awt.*;

public class MovieListWindow extends JFrame {
    public static final String MOVIES = "Movies";
    private final MovieListEditor editor;
    private JList movieList;

    public MovieListWindow(MovieListEditor editor) {
        this.editor = editor;
        init();
    }

    private void init() {
        initList();
        setTitle(MOVIES);
        setVisible(true);
    }

    private void initList() {
        movieList = new JList();
        movieList.setListData(editor.getMovies());
        getContentPane().add(movieList);
    }

    public JList getMovieList() {
        return movieList;
    }

    public boolean contains(Component searchFor) {
        if (searchFor == null) return false;
        for (Component component: getContentPane().getComponents())
            if (component == searchFor)
                return true;
        return false;
    }
}
