package Command;

public class CountGreaterGenreCommand extends CommandAbstract{


    public CountGreaterGenreCommand(String name, String description) {
        super(name, description);
    }
//TODO count great genre
    public void execute(String arg) {
        System.out.println("count great genre");
    }
}
