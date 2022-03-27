package Command;

public class AverageOfOscarsCommand extends CommandAbstract{


    public AverageOfOscarsCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("average of oscars");;
    }
}
