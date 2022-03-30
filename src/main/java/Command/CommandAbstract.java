package Command;

public abstract class CommandAbstract {
    final String name;
    final String description;

    public CommandAbstract(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void execute(String arg) {
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
