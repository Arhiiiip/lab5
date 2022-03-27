package utility;

import Data.Movie;
import utility.Interfaces.CollectionManagerInterface;
import utility.Interfaces.CollectionValidatorInterface;
import utility.Interfaces.ObjectValidator;

import java.util.LinkedHashSet;

public class CollectionValidator implements CollectionValidatorInterface, ObjectValidator {

    CollectionManagerInterface collectionManager;

    public CollectionValidator(CollectionManager aCollectionManager) {
        collectionManager = aCollectionManager;
    }

    @Override
    public String validateCollection(LinkedHashSet<Movie> inputCollection) {
        for (Movie movie : inputCollection) {

            if (validateObject(movie)) collectionManager.add(movie);
            else return "\n\tXml file has been broken!(not all objects was loaded)\n\n";
        }
        return "\n\tCollection was loaded!\n\n";
    }
}
