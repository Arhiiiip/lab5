package utility.Interfaces;

import Data.Color;
import Data.Country;
import Data.MovieGenre;

public interface FieldsProtectorInterface {

    default boolean isPositiveInt(String line) {
    return getOscarsCountCorrectStatus(line);
    }
    default boolean getOscarsCountCorrectStatus(String line) {

        try {
            return Integer.parseInt(line) > 0;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
    default boolean getIdCorrectStatus(String line) {

        if (line == null || line.equals("null")) return false;
        try {
            return Long.parseLong(line) > 0;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    default boolean getNameCorrectStatus(String line) {

        return line != null && !line.equals("null");
    }

    default boolean getCoordinateXCorrectStatus(String line) {

        try {
            int x = Integer.parseInt(line);
            if (316 < x) {return false;} else {
                return true;
            }
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    default boolean getCoordinateYCorrectStatus(String line) {

        if (line == null || line.equals("null")) return false;

        try {
            Double.parseDouble(line);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    default boolean getMovieGenreCorrectStatus(String line){
        return line != null && !line.equals("null") && MovieGenre.isIncludeElement(line);
    }

    default boolean getPersonCorrectStatus(String line){
        return line != null && !line.equals("null");
    }

    default boolean getPersonWeightCorrectStatus(String line){
        if (line != null && !line.equals("null")) return false;
        return isPositiveInt(line);
    }

    default boolean getEyeColorCorrectStatus(String line){
        return line != null && !line.equals("null") && Color.isIncludeElement(line);
    }

    default boolean getNationalityCorrectStatus(String line){
        return line != null && !line.equals("null") && Country.isIncludeElement(line);
    }

    default boolean getLocationXCorrectStatus(String line) {
        try {
            int x = Integer.parseInt(line);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    default boolean getLocationYCorrectStatus(String line) {

        try {
            Float y = Float.parseFloat(line);
                return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    default boolean getLocationCorrectStatus(String line) {
        return line != null && !line.equals("null");
    }

    default boolean getCoordinatesCorrectStatus(String line) {
        return line != null && !line.equals("null");
    }
}
