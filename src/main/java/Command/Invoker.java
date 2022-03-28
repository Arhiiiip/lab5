package Command;

import utility.MovieFactory;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Invoker {
public Map<String, CommandAbstract> commands;
private Receiver receiver;

    public Invoker(LinkedHashSet collectionForWork, Receiver receiver, MovieFactory movieFactory) {
        commands = new HashMap<>();
        this.receiver = receiver;
        initCommands(movieFactory);
    }

    public void initCommands(MovieFactory movieFactory){
        commands.put("add", new AddCommand("add", "Добавить новый элемент в коллекцию", movieFactory));
        commands.put("help", new HelpCommand("help", "Вывести справку по доступным командам", commands));
        commands.put("show", new ShowCommand("show", "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении"));
        commands.put("sum_of_oscars_count", new SumOfOscarsCommand("sum_of_oscars_count", "Вывести сумму значений поля oscarsCount для всех элементов коллекции"));
        commands.put("clear", new ClearCommand("clear", "Очистить коллекцию"));
        commands.put("average_of_oscars_count", new AverageOfOscarsCommand("average_of_oscars_count", "Вывести среднее значение поля oscarsCount для всех элементов коллекции"));
        commands.put("remove_by_id", new RemoveByIdCommand("remove_by_id", "Удалить элемент из коллекции по его id", movieFactory));
        commands.put("remove_lower", new RemoveLowerCommand("remove_lower {element}", "Удалить из коллекции все элементы, меньшие, чем заданный"));

    }

    public void execute(String name,String arg,  LinkedHashSet collectionFotWork){
        if (commands.containsKey(name)) {
            receiver.execute(commands.get(name),arg, collectionFotWork);
        } else {
            System.out.println("Input is incorrect.");
        }
    }
}
