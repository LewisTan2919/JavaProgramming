package BehavioralPattern.State;

public class PunctuateState extends State {
    PunctuateState(TokenContext tokenContext) {
        super(tokenContext);
    }

    @Override
    public String getToken() {
        String token=this.tokenContext.tokenSource.pop()+"";
        System.out.println("Punctuate token: "+token);
        return token;
    }
}
