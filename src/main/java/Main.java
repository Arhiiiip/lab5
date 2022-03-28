import Command.Invoker;
import Command.Receiver;
import Data.Movie;
import org.xml.sax.SAXException;
import utility.FileWorker;
import utility.MovieFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Scanner scanner = new Scanner(System.in);
        String link = args[0];
        FileWorker fileWorker = new FileWorker();
        LinkedHashSet<Movie> collectionForWork = fileWorker.parse(link);
        HashSet hashSetId = fileWorker.takeHashSetId();
        System.out.println(scanner);
        String commandUser = scanner.nextLine();
        MovieFactory movieFactory = new MovieFactory(scanner, hashSetId);
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(collectionForWork, receiver, movieFactory);
        String arg = scanner.nextLine();
        invoker.execute(commandUser,arg, collectionForWork);
        System.out.println(collectionForWork);
    }

}