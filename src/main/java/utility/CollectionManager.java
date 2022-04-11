package utility;

import Data.Movie;
import utility.Interfaces.CollectionManagerInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;

public class CollectionManager implements CollectionManagerInterface {

    public LinkedHashSet<Movie> moviesLinkedHashSet;
    public LinkedHashSet<Movie> savedCollection = new LinkedHashSet<>();
    public LocalDateTime dateInitialization;
    public LocalDateTime dateUpdate;
    int countChange;

    public CollectionManager(LinkedHashSet<Movie> moviesLinkedHashSet, LocalDateTime dateInitialization, LocalDateTime dateUpdate, int countChange) {
        this.moviesLinkedHashSet = moviesLinkedHashSet;
        this.dateInitialization = dateInitialization;
        this.dateUpdate = dateUpdate;
        this.countChange = countChange;
        savedCollection.addAll(moviesLinkedHashSet);
    }

    public LinkedHashSet<Movie> getMoviesLinkedHashSet() {
        return moviesLinkedHashSet;
    }

    public void setMoviesLinkedHashSet(LinkedHashSet<Movie> moviesLinkedHashSet) {
        this.moviesLinkedHashSet = moviesLinkedHashSet;
    }

    public void setSavedCollection(LinkedHashSet<Movie> collection){
        savedCollection = collection;
    }

    public LocalDateTime getDateInitialization() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        CharSequence dateFormat = dateInitialization.format(formatter);
        return LocalDateTime.parse(dateFormat, formatter);
    }

    public void setDateInitialization(LocalDateTime dateInitialization) {
        this.dateInitialization = dateInitialization;
    }

    public LocalDateTime getDateUpdate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        CharSequence dateFormat = dateUpdate.format(formatter);
        return LocalDateTime.parse(dateFormat, formatter);
    }

    public void setDateUpdate() {
        this.dateUpdate = LocalDateTime.now();
    }

//    public int getCountChange() {
//        collectionForComparison.addAll(moviesLinkedHashSet);
//        LinkedHashSet<Movie> collectionForRemove = new LinkedHashSet<>();
//        for (Movie movieSaved : savedCollection){
//            for (Movie movie : collectionForComparison){
//                if(movieSaved.equals(movie)){
//                    collectionForRemove.add(movie);
//                }
//            }
//        }
//        System.out.println(collectionForRemove);
//        System.out.println(collectionForComparison);
//        System.out.println(savedCollection);
//        savedCollection.removeAll(collectionForRemove);
//        collectionForComparison.removeAll(collectionForRemove);
//        countChange = savedCollection.size() + collectionForComparison.size();
//        return countChange;
//    }
}
