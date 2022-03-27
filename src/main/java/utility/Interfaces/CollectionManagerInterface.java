package utility.Interfaces;

import Data.Movie;

import java.util.LinkedHashSet;

public interface CollectionManagerInterface {

    String getInfo();

    LinkedHashSet<Movie> getCollection();

    LinkedHashSet<Integer> getUsedId();

    void setCollection(LinkedHashSet<Movie> Movies);

    void add(Movie movie);

    void remove(Movie movie);

    Movie getId(int id);

    void clear();
}
