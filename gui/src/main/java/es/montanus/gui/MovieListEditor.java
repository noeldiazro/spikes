package es.montanus.gui;

import java.util.Vector;

public interface MovieListEditor {
    Vector getMovies();
    void add(String string);
    void delete(int id);
}
