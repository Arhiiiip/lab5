package utility;

import Data.Movie;
import utility.Interfaces.CollectionManagerInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;

public class CollectionManager implements CollectionManagerInterface {

    public LinkedHashSet<Movie> moviesLinckedHashSet = new LinkedHashSet();
    public LinkedHashSet<Movie> savedCollection = (LinkedHashSet<Movie>) moviesLinckedHashSet.clone();
    public LocalDateTime dateInitialization;
    public LocalDateTime dateUpdate;
    int countChange;


    public CollectionManager(LinkedHashSet<Movie> moviesLinckedHashSet, LocalDateTime dateInitialization, LocalDateTime dateUpdate, int countChange) {
        this.moviesLinckedHashSet = moviesLinckedHashSet;
        this.dateInitialization = dateInitialization;
        this.dateUpdate = dateUpdate;
        this.countChange = countChange;
    }

    public LinkedHashSet<Movie> getMoviesLinckedHashSet() {
        return moviesLinckedHashSet;
    }

    public void setMoviesLinckedHashSet(LinkedHashSet<Movie> moviesLinckedHashSet) {
        this.moviesLinckedHashSet = moviesLinckedHashSet;
    }

    public void setSavedCollection(LinkedHashSet<Movie> collection){
        savedCollection = collection;
    }

    public LocalDateTime getDateInitialization() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        CharSequence dateFormate = dateInitialization.format(formatter);
        LocalDateTime dateInitializationOut = LocalDateTime.parse(dateFormate, formatter);
        return dateInitializationOut;
    }

    public void setDateInitialization(LocalDateTime dateInitialization) {
        this.dateInitialization = dateInitialization;
    }

    public LocalDateTime getDateUpdate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        CharSequence dateFormate = dateUpdate.format(formatter);
        LocalDateTime dateUpdateOut = LocalDateTime.parse(dateFormate, formatter);
        return dateUpdateOut;
    }

    public void setDateUpdate() {
        this.dateUpdate = LocalDateTime.now();
    }

    public int getCountChange() {
        LinkedHashSet<Movie> collectionForComparison = new LinkedHashSet();
        LinkedHashSet<Movie> collectionForRemove = new LinkedHashSet();
        for (Movie movieSaved : savedCollection){
            for (Movie movie : collectionForComparison){
                if(movieSaved.equals(movie)){
                    collectionForRemove.add(movie);
                }
            }
        }
        savedCollection.removeAll(collectionForRemove);
        collectionForComparison.removeAll(collectionForRemove);
        countChange = savedCollection.size() + collectionForComparison.size();
        return countChange;
    }
}
