package BehavioralPattern.State;

public class Run {
    public static void main(String[] args) {
        String text="1234,,,000asdf,,,000";
        TokenSource tokenSource=new TokenSource(text);
        TokenContext tokenContext=new TokenContext(tokenSource);
        while(!tokenContext.isEmpty()){
            tokenContext.getToken();
        }

    }
}
