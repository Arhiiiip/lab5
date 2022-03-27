package Data;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum MpaaRating {
    G("G","g"),
    PG("PG", "pg"),
    PG_13("PG_13", "pg_13"),
    R("R","r"),
    NC_17("NC_17", "nc_17");
    private final String stringInUpperCaseRepresentation;
    private final String stringInLowerCaseRepresentation;

    MpaaRating(String aStringInUpperCaseRepresentation, String aStringInLowerCaseRepresentation) {
        stringInUpperCaseRepresentation = aStringInUpperCaseRepresentation;
        stringInLowerCaseRepresentation = aStringInLowerCaseRepresentation;
    }

    private String getStringInLowerCaseRepresentation() {
        return stringInLowerCaseRepresentation;
    }

    private String getStringInUpperCaseRepresentation() {
        return stringInUpperCaseRepresentation;
    }

    public static boolean isIncludeElement(String aMpaaRating) {

        for (MpaaRating currentMpaaRating : MpaaRating.values()) {
            if (aMpaaRating.equals(currentMpaaRating.getStringInUpperCaseRepresentation())) return true;
            if (aMpaaRating.equals(currentMpaaRating.getStringInLowerCaseRepresentation())) return true;
        }

        return false;
    }
}
