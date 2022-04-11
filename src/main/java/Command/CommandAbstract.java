package Command;

public abstract class CommandAbstract  {

    final String name;
    final String description;
    final boolean isArgument;

    public CommandAbstract(String name, String description, boolean isArgument) {
        this.name = name;
        this.description = description;
        this.isArgument = isArgument;
    }

    public void execute(String arg){
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
