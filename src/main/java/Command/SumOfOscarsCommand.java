package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class SumOfOscarsCommand extends CommandAbstract {

    public SumOfOscarsCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        int sum = 0;
        Object[] array = collectionForWork.toArray();
        for (int i = 0; i < array.length; i++){
            Movie mov = (Movie) array[i];
            sum = sum + mov.getOscarsCount();
        }
        System.out.println(sum);
    }
}