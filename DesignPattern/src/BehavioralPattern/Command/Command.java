package BehavioralPattern.Command;

public abstract class Command {
    protected Data num;
    protected Data backup;

    public Command(Data num){
        this.num=num;
        this.backup=new Data(num.num);
    }

    public void backUp(){
        copy(num,backup);

    }

    public void undo(){

        copy(backup,num);
        System.out.println(num.num);
    }

    public void copy(Data a,Data b){
        b.setNum(a.num);
    }

    public abstract boolean execute();
}
