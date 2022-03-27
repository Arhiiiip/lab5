package Command;

public class SumOfOscarsCommand extends CommandAbstract{

    public SumOfOscarsCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("sum of oscars");
    }
}
