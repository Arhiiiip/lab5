package utility.Interfaces;

import Data.Movie;

public interface ObjectValidator extends FieldsProtectorInterface{
    default boolean validateObject(Movie aMovie){
        return getIdCorrectStatus(String.valueOf(aMovie.getId())) &&
                getCoordinatesCorrectStatus(String.valueOf(aMovie.getCoordinates())) &&
                getCoordinateXCorrectStatus(String.valueOf(aMovie.getCoordinates().getX())) &&
                getCoordinateYCorrectStatus(String.valueOf(aMovie.getCoordinates().getY())) &&
                getEyeColorCorrectStatus(String.valueOf(aMovie.getDirector().getEyeColor())) &&
                getLocationCorrectStatus(String.valueOf(aMovie.getDirector().getLocation())) &&
                getPersonWeightCorrectStatus(String.valueOf(aMovie.getDirector().getWeight())) &&
                getOscarsCountCorrectStatus(String.valueOf(aMovie.getOscarsCount())) &&
                getNationalityCorrectStatus(String.valueOf(aMovie.getDirector().getNationality())) &&
                getMovieGenreCorrectStatus(String.valueOf(aMovie.getGenre())) &&
                getLocationYCorrectStatus(String.valueOf(aMovie.getDirector().getLocation().getY())) &&
                getLocationXCorrectStatus(String.valueOf(aMovie.getDirector().getLocation().getX())) &&
                getPersonCorrectStatus(String.valueOf(aMovie.getDirector())) &&
                getNameCorrectStatus(String.valueOf(aMovie.getName())) &&
                getNameCorrectStatus(String.valueOf(aMovie.getDirector().getName())) &&
                getNameCorrectStatus(String.valueOf(aMovie.getDirector().getLocation().getName()));
    }
}
