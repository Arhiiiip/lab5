import Command.Invoker;
import Command.Receiver;
import Data.Movie;
import org.xml.sax.SAXException;
import utility.CollectionManager;
import utility.FileWorker;
import utility.MovieFactory;
import utility.Reader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;



public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Reader reader = new Reader();
        String link = args[0];
        FileWorker fileWorker = new FileWorker();
        //TODO Проверить валидность файла
        LinkedHashSet<Movie> collectionForWork = fileWorker.parse(link);
        CollectionManager collectionManager = new CollectionManager(collectionForWork, LocalDateTime.now(), LocalDateTime.now(), 0);
        HashSet hashSetId = fileWorker.takeHashSetId();
        MovieFactory movieFactory = new MovieFactory(reader, hashSetId, collectionForWork, collectionManager);
        Receiver receiver = new Receiver();
        boolean temp = true;
        Invoker invoker = new Invoker(receiver, movieFactory, temp);
        while (temp) {
            String commandUser = reader.read();
            invoker.execute(commandUser);
            System.out.println(collectionForWork);
        }
    }
}