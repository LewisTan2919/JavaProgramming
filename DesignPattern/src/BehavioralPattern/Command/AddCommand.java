package BehavioralPattern.Command;

public class AddCommand extends Command {

    public AddCommand(Data num) {
        super(num);
    }

    @Override
    public boolean execute() {
        if(num==null){
            return false;
        }
        backUp();
        num.num++;
        System.out.println(num.num);
        return true;
    }
}
