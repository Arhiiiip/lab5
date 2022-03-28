package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class AverageOfOscarsCommand extends CommandAbstract{


    public AverageOfOscarsCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        int sum = 0;
        float average;
        Object[] array = collectionForWork.toArray();
        for (int i = 0; i < array.length; i++){
            Movie mov = (Movie) array[i];
            sum = sum + mov.getOscarsCount();
        }
        average = sum/array.length;
        System.out.println(average);
        System.out.println(sum/array.length);
    }
}
