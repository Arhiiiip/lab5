package Data;

public enum Country {
    RUSSIA("RUSSIA", "russia"),
    GERMANY("GERMANY", "germany"),
    FRANCE("FRANCE", "france");

    private final String stringInUpperCaseRepresentation;
    private final String stringInLowerCaseRepresentation;

    Country(String aStringInUpperCaseRepresentation, String aStringInLowerCaseRepresentation) {
        stringInUpperCaseRepresentation = aStringInUpperCaseRepresentation;
        stringInLowerCaseRepresentation = aStringInLowerCaseRepresentation;
    }

    private String getStringInLowerCaseRepresentation() {
        return stringInLowerCaseRepresentation;
    }

    private String getStringInUpperCaseRepresentation() {
        return stringInUpperCaseRepresentation;
    }

    public static boolean isIncludeElement(String aCountry) {

        for (Country currentCountry : Country.values()) {
            if (aCountry.equals(currentCountry.getStringInUpperCaseRepresentation())) return true;
            if (aCountry.equals(currentCountry.getStringInLowerCaseRepresentation())) return true;
        }

        return false;
    }
}
