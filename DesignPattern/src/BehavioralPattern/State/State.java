package BehavioralPattern.State;

public abstract class State {

    TokenContext tokenContext;

    State(TokenContext tokenContext){
        this.tokenContext=tokenContext;
    }

    public abstract String getToken();
}
