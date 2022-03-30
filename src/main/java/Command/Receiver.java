package Command;

public class Receiver {

    public Receiver(){
    }

    public void execute(CommandAbstract command,String arg){
        command.execute(arg);
    }
}
