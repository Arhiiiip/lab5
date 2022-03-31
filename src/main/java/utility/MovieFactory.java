package utility;


import Data.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MovieFactory {
        private final Scanner scanner;
        private Long id;
        private Object loadObject;
        HashSet hashSetId;
        private boolean boolWF;
        LinkedHashSet<Movie> collectionForWork;

        public MovieFactory(Scanner scanner, HashSet hashSetId, LinkedHashSet<Movie> collectionForWork) {
            this.hashSetId = hashSetId;
            this.scanner = scanner;
            this.collectionForWork = collectionForWork;
        }

        public void setLoadObject(Object loadObject){
            this.loadObject = loadObject;
        }
        public Object getLoadObject(){
            return loadObject;
        }
        public Long getId() {
            return id;
        }
        public Scanner getScanner(){
            return scanner;
        }
        public LinkedHashSet<Movie> getCollectionForWork() {
        return collectionForWork;
    }

    public Movie GetMovieFromConsole(){
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

        ReadAndCheck readAndCheck = new ReadAndCheck(scanner, boolWF);
        id = readAndCheck.autoCreatAndCheckId(hashSetId);
        movieName = readAndCheck.readAndCheckName();
        coordinatesX = readAndCheck.readAndCheckCordinateX();
        coordinatesY = readAndCheck.readAndCheckCordinateY();
        coordinates = new Coordinates(coordinatesX, coordinatesY);
        LocalDateTime creationDate = readAndCheck.autoCreatAndCheckDate();
        oscarsCount = readAndCheck.readAndCheckOscarsCount();
        genre = readAndCheck.readAndCheckMovieGenre();
        mpaaRating = readAndCheck.readAndCheckMpaaRating();
        personName = readAndCheck.readAndCheckName();
        weight = readAndCheck.readAndCheckWeight();
        eyeColor = readAndCheck.readAndCheckColor();
        nationality = readAndCheck.readAndCheckCountry();
        locationName = readAndCheck.readAndCheckName();;
        locationX = readAndCheck.readAndCheckLocationX();
        locationY = readAndCheck.readAndCheckLocationY();
        location = new Location(locationX, locationY,locationName);
        director = new Person(personName, weight, eyeColor, nationality, location);
        Movie movie = new Movie(id, movieName, coordinates, creationDate, oscarsCount, genre, mpaaRating,director);
    return movie;
    }
}
