//package utility;
//
//import Data.Movie;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import java.io.File;
//import java.io.IOException;
//import java.util.LinkedHashSet;
//
//public class Parser {
//
//    public LinkedHashSet<Movie> parse(){
//        SAXParserFactory  factory = SAXParserFactory.newInstance();
//        ParserHandler handler = new ParserHandler();
//        SAXParser parser = null;
//        try {
//            parser = factory.newSAXParser();
//        } catch (Exception e) {
//            System.out.println("Open SAX parser error " + e.toString());
//            return null;
//        }
//        File file = new File("C:\\Users\\Asus\\Desktop\\Her\\Porno\\Lab5\\Test_1.0.xml");
//        try {
//            parser.parse(file, handler);
//        } catch (SAXException e) {
//            System.out.println("SAX parsing error " + e.toString());
//            return null;
//        } catch (IOException e) {
//            System.out.println("IO parsing error " + e.toString());
//            return null;
//        }
//        return handler.getCol();
//    }
//}
