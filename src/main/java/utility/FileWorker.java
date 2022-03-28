package utility;

import Data.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FileWorker {
    HashSet hashSetId = new HashSet();

    public LinkedHashSet parse(String link) throws IOException, SAXException, ParserConfigurationException {

        CreateFileForWork fileForWork = new CreateFileForWork();
        File file = fileForWork.creatFile(link);

        LinkedHashSet<Movie> collectionFromFile = new LinkedHashSet<>();
        long tempId = 0;
        String tempMovieName = null;
        Coordinates tempCoordinates = null;
        java.time.LocalDateTime tempCreationDate = null;
        int tempOscarsCount = 0;
        MovieGenre tempGenre = null;
        MpaaRating tempMpaaRating = null;
        Person tempDirector = null;
        int tempCoordinatesX = 0;
        Integer tempCoordinatesY = null;
        String tempPersonName = null;
        Float tempWeight = null;
        Color tempEyeColor = null;
        Country tempNationality = null;
        Location tempLocation = null;
        Integer tempLocationX = null;
        Float tempLocationY = null;
        String tempLocationName = null;


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = (Document) documentBuilder.parse(file);

        NodeList movieNodeList = document.getElementsByTagName("movie");

        for (int temp = 0; temp < movieNodeList.getLength(); temp++) {
            Node node = movieNodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                try {
                    tempId = Long.parseLong(element.getElementsByTagName("id").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                tempMovieName = element.getElementsByTagName("name").item(0).getTextContent();

                NodeList nodeListCoordinates = element.getElementsByTagName("coordinates");
                Element elemnetCoordinates = (Element) nodeListCoordinates.item(0);

                try {
                    tempCoordinatesX = Integer.parseInt(elemnetCoordinates.getElementsByTagName("coordinate_x").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }
                try {
                    tempCoordinatesY = Integer.parseInt(elemnetCoordinates.getElementsByTagName("coordinate_y").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                try {
                    tempCreationDate = java.time.LocalDateTime.parse(element.getElementsByTagName("creationDate").item(0).getTextContent());
                } catch (DateTimeParseException exception) {
                    System.out.println("Wrong");
                }

                try {
                    tempOscarsCount = Integer.parseInt(element.getElementsByTagName("oscarsCount").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                try {
                    tempGenre = MovieGenre.valueOf(element.getElementsByTagName("genre").item(0).getTextContent());
                } catch (Exception exception) {
                    System.out.println("Dvoinoy posos");
                }

                try {
                    tempMpaaRating = MpaaRating.valueOf(element.getElementsByTagName("mpaaRating").item(0).getTextContent());
                } catch (Exception exception) {
                    System.out.println("Dvoinoy posos");
                }

                NodeList nodeListPerson = element.getElementsByTagName("director");
                Element elementPerson = (Element) nodeListPerson.item(0);

                tempPersonName = elementPerson.getElementsByTagName("name").item(0).getTextContent();

                try {
                    tempWeight = Float.parseFloat(element.getElementsByTagName("weight").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                try {
                    tempEyeColor = Color.valueOf(element.getElementsByTagName("eyecolor").item(0).getTextContent());
                } catch (Exception exception) {
                    System.out.println("Dvoinoy posos");
                }

                try {
                    tempNationality = Country.valueOf(element.getElementsByTagName("nationality").item(0).getTextContent());
                } catch (Exception exception) {
                    System.out.println("Dvoinoy posos");
                }

                NodeList nodeListLocation = elementPerson.getElementsByTagName("location");
                Element elementLocation = (Element) nodeListLocation.item(0);

                tempLocationName = elementLocation.getElementsByTagName("name").item(0).getTextContent();

                try {
                    tempLocationX = Integer.parseInt(elementLocation.getElementsByTagName("loc_y").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                try {
                    tempLocationY = Float.parseFloat(elementLocation.getElementsByTagName("loc_y").item(0).getTextContent());
                } catch (NumberFormatException exeption) {
                    System.out.println("sosi");
                }

                collectionFromFile.add(new Movie(tempId, tempMovieName, new Coordinates(tempCoordinatesX, tempCoordinatesY), tempCreationDate,
                        tempOscarsCount, tempGenre, tempMpaaRating, new Person(tempPersonName, tempWeight,
                        tempEyeColor, tempNationality, new Location(tempLocationX, tempLocationY, tempLocationName))));

                hashSetId.add(tempId);
            }
        }
        System.out.println(collectionFromFile);
    return collectionFromFile;
    }
    public HashSet takeHashSetId(){
        return hashSetId;
    }
}

