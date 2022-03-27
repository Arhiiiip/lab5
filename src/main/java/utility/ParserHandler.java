//package utility;
//
//import Data.Coordinates;
//import Data.Location;
//import Data.Movie;
//import org.xml.sax.Attributes;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;
//
//public class ParserHandler extends DefaultHandler{
//
//
//    private static final String TAG_NAME_MOVIE = "name";
//    private static final String TAG_MOVIE = "movie";
//    private static final String TAG_ID = "id";
//    private static final String TAG_CREATION_DATE = "creationDate";
//    private static final String TAG_OSCARS_COUNT = "oscarsCount";
//    private static final String TAG_GENRE = "genre";
//    private static final String TAG_MPAA_RATING = "mpaaRating";
//    private static final String TAG_COORDINATES = "coordinate";
//    private static final String TAG_COORDINATE_X = "coordinate_x";
//    private static final String TAG_COORDINATE_Y = "coordinate_y";
//    private static final String TAG_DIRECTOR = "director";
//    private static final String TAG_NAME_DIRECTOR = "name";
//    private static final String TAG_WEIGHT = "weight";
//    private static final String TAG_EYE_COLOR = "eyecolor";
//    private static final String TAG_NATIONALITY = "nationality";
//    private static final String TAG_LOCATION = "location";
//    private static final String TAG_LOCATION_X = "loc_x";
//    private static final String TAG_LOCATION_Y = "loc_y";
//    private static final String TAG_NAME_LOCATION = "name";
//
//    final LinkedHashSet<Movie> movieLinkedHashSet = new LinkedHashSet<>();
//    List<Location> locationList = new ArrayList<>();
//    Movie movie = new Movie();
//    private String currentTagName;
//    private boolean isDirector = false;
//    private boolean isLocation = false;
//    private boolean isMovie = false;
//    private boolean isCoordinates = false;
//
//    private String name;
//    private Integer locX;
//    private Float locY;
//    private int corX;
//    private Float corY;
//
//
//    public LinkedHashSet<Movie> getCol() {
//        return movieLinkedHashSet;
//    }
//
//    @Override
//    public void startDocument() throws SAXException{
////        System.out.println("Start document");
//    }
//
//    @Override
//    public void endDocument() throws SAXException{
//
//    }
//
//    @Override
//    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//        //System.out.println("Start element" + qName);
//        currentTagName = qName;
//        if (currentTagName == null){
//            return;
//        }
//        if(currentTagName.equals(TAG_DIRECTOR)){
//            isDirector = true;
//        }
//        if(currentTagName.equals(TAG_LOCATION)){
//            isLocation = true;
//        }
//        if(currentTagName.equals(TAG_MOVIE)){
//            isMovie = true;
//        }
//
//        if(currentTagName.equals(TAG_COORDINATES)){
//            isCoordinates = true;
//        }
//    }
//
//    @Override
//    public void endElement(String uri, String localName, String qName) throws SAXException {
//        //System.out.println("End element" + qName);
//            if (qName.equals(TAG_DIRECTOR)) {
//                isDirector = false;
//            }
//            if (qName.equals(TAG_COORDINATES)) {
//                isCoordinates = false;
//            }
//            if (qName.equals(TAG_LOCATION)) {
//                isLocation = false;
//
//                Location location = new Location(locX, locY, name);
//                locationList.add(location);
//
//            }
//            if (qName.equals(TAG_MOVIE)) {
//                isMovie = false;
//                movieLinkedHashSet.add(movie);
//            }
//        currentTagName = null;
//    }
//
//    @Override
//    public void characters(char[] ch, int start, int length) throws SAXException {
//        if (currentTagName == null){
//            return;
//        }
//
//        if (!isDirector && !isLocation && currentTagName.equals(TAG_NAME_MOVIE)) {
//            movie.setName(new String(ch, start, length));
//        }
//
//        if (!isDirector && !isLocation && currentTagName.equals(TAG_ID)) {
//            movie.setId(Long.parseLong(new String(ch, start, length)));
//        }
//
//        if (isCoordinates && currentTagName.equals(TAG_COORDINATES)){
//            movie.setCoordinates(new Coordinates(corX, corY));
//        }
//
////        if(currentTagName.equals(TAG_CREATION_DATE)){
////            movie.setCreationDate(LocalDateTime.parse(new String(ch, start, length)));
////        }
//
//        if (isMovie && isLocation && currentTagName.equals(TAG_LOCATION)) {
//            if (currentTagName.equals(TAG_LOCATION_X)) {
//                locX = Integer.valueOf(new String(ch, start, length));
//            } else if (currentTagName.equals(TAG_LOCATION_Y)) {
//                locY = Float.valueOf(new String(ch, start, length));
//            } else if (currentTagName.equals(TAG_NAME_MOVIE)) {
//                name = new String(ch, start, length);
//            }
//        }
//            if (isCoordinates) {
//                if (currentTagName.equals(TAG_COORDINATE_X)) {
//                    corX = Integer.parseInt((new String(ch, start, length)));
//                } else if (currentTagName.equals(TAG_COORDINATE_Y)) {
//                    corY = Float.valueOf(new String(ch, start, length));
//                }
//            }
//    }
//}
