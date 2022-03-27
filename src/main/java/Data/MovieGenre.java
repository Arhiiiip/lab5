package Data;

public enum MovieGenre {
    WESTERN("WESTERN", "western"),
    DRAMA("DRAMA", "drama"),
    TRAGEDY("TRAGEDY", "tragedy"),
    SCIENCE_FICTION("SCIENCE_FICTION", "science_fiction");

    private final String stringInUpperCaseRepresentation;
    private final String stringInLowerCaseRepresentation;

    MovieGenre(String aStringInUpperCaseRepresentation, String aStringInLowerCaseRepresentation) {
        stringInUpperCaseRepresentation = aStringInUpperCaseRepresentation;
        stringInLowerCaseRepresentation = aStringInLowerCaseRepresentation;
    }

    private String getStringInLowerCaseRepresentation() {
        return stringInLowerCaseRepresentation;
    }

    private String getStringInUpperCaseRepresentation() {
        return stringInUpperCaseRepresentation;
    }

    public static boolean isIncludeElement(String aMovieGenre) {

        for (MovieGenre currentMovieGenre : MovieGenre.values()) {
            if (aMovieGenre.equals(currentMovieGenre.getStringInUpperCaseRepresentation())) return true;
            if (aMovieGenre.equals(currentMovieGenre.getStringInLowerCaseRepresentation())) return true;
        }

        return false;
    }
}
