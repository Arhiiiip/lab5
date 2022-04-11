package utility;


import Data.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MovieFactory {
    private Long id;
    HashSet hashSetId;
    LinkedHashSet<Movie> collectionForWork;
    CollectionManager collectionManager;


    public MovieFactory(HashSet hashSetId, CollectionManager collectionManager) {
        this.hashSetId = hashSetId;
        this.collectionManager = collectionManager;
    }

    public Long getId() {
        return id;
    }

    public LinkedHashSet<Movie> getCollectionForWork() {
        return collectionManager.getMoviesLinkedHashSet();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashSet getHashSetId() {
        return hashSetId;
    }

    public void setHashSetId(HashSet hashSetId) {
        this.hashSetId = hashSetId;
    }

    public void setCollectionForWork(LinkedHashSet<Movie> collectionForWork) {
        this.collectionForWork = collectionForWork;
    }

    public CollectionManager getCollectionManager() {
        return collectionManager;
    }

    public void setCollectionManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public Movie GetMovieFromConsole() {
        long id;
        String movieName;
        Coordinates coordinates;
        int oscarsCount;
        MovieGenre genre;
        MpaaRating mpaaRating;
        Person director;
        int coordinatesX;
        Integer coordinatesY;
        String personName;
        Float weight;
        Color eyeColor;
        Country nationality;
        Location location;
        Integer locationX;
        Float locationY;
        String locationName;

        id = ReadAndCheck.autoCreatAndCheckId(hashSetId);
        movieName = ReadAndCheck.readAndCheckName();
        coordinatesX = ReadAndCheck.readAndCheckCoordinateX();
        coordinatesY = ReadAndCheck.readAndCheckCoordinateY();
        coordinates = new Coordinates(coordinatesX, coordinatesY);
        LocalDateTime creationDate = ReadAndCheck.autoCreatAndCheckDate();
        oscarsCount = ReadAndCheck.readAndCheckOscarsCount();
        genre = ReadAndCheck.readAndCheckMovieGenre();
        mpaaRating = ReadAndCheck.readAndCheckMpaaRating();
        personName = ReadAndCheck.readAndCheckName();
        weight = ReadAndCheck.readAndCheckWeight();
        eyeColor = ReadAndCheck.readAndCheckColor();
        nationality = ReadAndCheck.readAndCheckCountry();
        locationName = ReadAndCheck.readAndCheckName();
        locationX = ReadAndCheck.readAndCheckLocationX();
        locationY = ReadAndCheck.readAndCheckLocationY();
        location = new Location(locationX, locationY, locationName);
        director = new Person(personName, weight, eyeColor, nationality, location);
        return new Movie(id, movieName, coordinates, creationDate, oscarsCount, genre, mpaaRating, director);

    }
}
