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
        //TODO Проверить валидность файла
        LinkedHashSet<Movie> collectionForWork = fileWorker.parse(link);
        HashSet hashSetId = fileWorker.takeHashSetId();
        System.out.println(scanner);
        MovieFactory movieFactory = new MovieFactory(scanner, hashSetId, collectionForWork);
        Receiver receiver = new Receiver();
        boolean temp = true;
        Invoker invoker = new Invoker(receiver, movieFactory, temp);
        while (temp) {
            String commandUser = scanner.nextLine();
            String arg = scanner.nextLine();
            invoker.execute(commandUser, arg);
            System.out.println(collectionForWork);
        }
    }
}