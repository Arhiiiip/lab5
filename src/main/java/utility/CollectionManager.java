package utility;

import Data.Movie;
import utility.Interfaces.CollectionManagerInterface;

import java.util.LinkedHashSet;

public class CollectionManager implements CollectionManagerInterface {

    public LinkedHashSet<Movie> moviesLinckedHashSet = new LinkedHashSet();

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public LinkedHashSet<Movie> getCollection() {
        return null;
    }

    @Override
    public LinkedHashSet<Integer> getUsedId() {
        return null;
    }

    @Override
    public void setCollection(LinkedHashSet<Movie> Movies) {

    }

    @Override
    public void add(Movie movie) {
        System.out.println("add");
        moviesLinckedHashSet.add(movie);
        assert moviesLinckedHashSet.size() == 0;
    }

    @Override
    public void remove(Movie movie) {

    }

    @Override
    public Movie getId(int id) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        return "moviesLinckedHashSet=" + moviesLinckedHashSet.toString();
    }
}
