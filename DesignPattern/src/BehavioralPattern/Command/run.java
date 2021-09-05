package BehavioralPattern.Command;

public class run {

    private static CommandHistory history=new CommandHistory();
    public static void main(String[] args) {
        Data object=new Data(0);
        Command addCommand=new AddCommand(object);
        Command minusCommand=new MinusCommand(object);

        Execute(addCommand);
        Execute(minusCommand);
        undo();
        undo();
    }

    public  static void Execute(Command command){
        if(command.execute()){
            history.push(command);
        }
    }

    public  static void undo(){
        if(history.isEmpty()){
            return;
        }
        Command pre=history.pop();
        pre.undo();
    }
}
