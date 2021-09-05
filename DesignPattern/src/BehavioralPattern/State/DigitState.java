package BehavioralPattern.State;

public class DigitState extends State{
    DigitState(TokenContext tokenContext) {
        super(tokenContext);
    }

    @Override
    public String getToken() {
        String token=this.tokenContext.tokenSource.pop()+"";
        System.out.println("Digit token: "+token);
        return token;
    }
}
