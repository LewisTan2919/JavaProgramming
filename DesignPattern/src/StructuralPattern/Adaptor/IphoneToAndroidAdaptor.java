package StructuralPattern.Adaptor;

public class IphoneToAndroidAdaptor extends Android{
    private Iphone iphone;

    public IphoneToAndroidAdaptor(Iphone iphone){
        this.iphone=iphone;
    }

    @Override
    public void isAndroid() {
        iphone.isIphone();
    }
}
