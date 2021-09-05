package BehavioralPattern.State;

import java.util.Stack;

public class TokenSource {
    Stack<Character> stack;

    public TokenSource(String s){
        stack=new Stack<>();
        for(char c:s.toCharArray()){
            stack.push(c);
        }
    }

    public char peek(){
        return stack.peek();
    }

    public char pop(){
        return stack.pop();
    }
}
