package BehavioralPattern.Command;


import java.util.*;

public class CommandHistory {
    private  Stack<Command> history=new Stack<>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        if(isEmpty()){
            return null;
        }
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}
