package Command;

import utility.MovieFactory;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
public Map<String, CommandAbstract> commands;
private Receiver receiver;
boolean temp;

    public Invoker(Receiver receiver, MovieFactory movieFactory, boolean temp) {
        commands = new HashMap<>();
        this.receiver = receiver;
        initCommands(movieFactory);
    }

    public void initCommands(MovieFactory movieFactory){
        commands.put("add", new AddCommand("add {element}", "Добавить новый элемент в коллекцию", movieFactory));
        commands.put("help", new HelpCommand("help", "Вывести справку по доступным командам", movieFactory, commands));
        commands.put("show", new ShowCommand("show", "Вывести в стандартный поток вывода все элементы коллекции в строковом представлении", movieFactory));
        commands.put("sum_of_oscars_count", new SumOfOscarsCommand("sum_of_oscars_count", "Вывести сумму значений поля oscarsCount для всех элементов коллекции", movieFactory));
        commands.put("clear", new ClearCommand("clear", "Очистить коллекцию", movieFactory));
        commands.put("average_of_oscars_count", new AverageOfOscarsCommand("average_of_oscars_count", "Вывести среднее значение поля oscarsCount для всех элементов коллекции", movieFactory));
        commands.put("remove_by_id", new RemoveByIdCommand("remove_by_id", "Удалить элемент из коллекции по его id", movieFactory));
        commands.put("remove_lower", new RemoveLowerCommand("remove_lower {element}", "Удалить из коллекции все элементы, меньшие, чем заданный", movieFactory));
        commands.put("add_if_max", new AddIfMaxCommand("add_if_max {element}", "Добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции", movieFactory));
        commands.put("add_if_min", new AddIfMinCommand("add_if_min {element}", "Добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции", movieFactory));
        commands.put("update_id", new UpdateIdCommand("update id {element}", "Oбновить значение элемента коллекции, id которого равен заданному", movieFactory));
        commands.put("exit", new ExitCommand("exit", "Завершить программу (без сохранения в файл)",movieFactory, temp));
        commands.put("count_greater_than_genre",  new CountGreaterGenreCommand("count_greater_than_genre genre", "Вывести количество элементов, значение поля genre которых больше заданного", movieFactory));
        commands.put("save", new SaveCommand("save", "сейв", movieFactory));
    }

    public void execute(String name,String arg){
        if (commands.containsKey(name)) {
            receiver.execute(commands.get(name),arg);
        } else {
            System.out.println("Input is incorrect.");
        }
    }
}
