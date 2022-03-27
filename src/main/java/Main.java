import Command.Invoker;
import Command.Receiver;
import Data.Movie;
import org.xml.sax.SAXException;
import utility.FileWorker;
import utility.MovieFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Scanner scanner = new Scanner(System.in);
        String link = args[0];
        FileWorker fileWorker = new FileWorker();
        LinkedHashSet<Movie> collectionForWork = fileWorker.parse(link);
        System.out.println(scanner);
        String commandUser = scanner.nextLine();
        MovieFactory movieFactory = new MovieFactory(scanner);
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(collectionForWork, receiver, movieFactory);
        invoker.execute(commandUser, collectionForWork);
        System.out.println(collectionForWork);
    }

}