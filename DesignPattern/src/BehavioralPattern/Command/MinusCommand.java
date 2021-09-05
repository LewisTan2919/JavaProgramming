package BehavioralPattern.Command;

public class MinusCommand extends Command{
    public MinusCommand(Data num) {
        super(num);
    }

    @Override
    public boolean execute() {
        if(num==null){
            return false;
        }else{
            backUp();
            num.num--;
            System.out.println(num.num);
            return true;
        }
    }
}
