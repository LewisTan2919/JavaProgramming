package BehavioralPattern.State;

public class OneCharState extends State{
    OneCharState(TokenContext tokenContext) {
        super(tokenContext);
    }

    @Override
    public String getToken() {
        String token=this.tokenContext.tokenSource.pop()+"";
        System.out.println("One Character token: "+token);
        return token;
    }
}
