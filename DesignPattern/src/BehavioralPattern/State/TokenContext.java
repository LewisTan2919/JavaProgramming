package BehavioralPattern.State;


public class TokenContext {
    TokenSource tokenSource;

    State curState;
    DigitState digitState;
    OneCharState oneCharState;
    PunctuateState punctuateState;

    public TokenContext(TokenSource tokenSource){
        this.tokenSource=tokenSource;
        digitState=new DigitState(this);
        oneCharState=new OneCharState(this);
        punctuateState=new PunctuateState(this);
    }

    public void setTokenSource(TokenSource tokenSource){
        this.tokenSource=tokenSource;
    }

    public boolean isDigit(){
        char c=tokenSource.peek();
        if(Character.isDigit(c)){
            return true;
        }
        return false;
    }

    public boolean isPunctuate(){
        char c=tokenSource.peek();
        if(!Character.isLetterOrDigit(c)){
            return true;
        }
        return false;
    }

    public boolean isOneCharacter(){
        char c=tokenSource.peek();
        if(Character.isLetter(c)){
            return true;
        }
        return false;
    }

    public State next(){
        if(isDigit()){
            return this.curState=digitState;
        }else if(isOneCharacter()){
            return this.curState=oneCharState;
        }else{
            return this.curState=punctuateState;
        }
    }

    public boolean isEmpty(){
        return this.tokenSource.stack.isEmpty();
    }

    public String getToken(){
        next();
        return this.curState.getToken();
    }
}
