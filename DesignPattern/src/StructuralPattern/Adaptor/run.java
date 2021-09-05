package StructuralPattern.Adaptor;

public class run {
    public static void main(String[] args) {
        Android android=new IphoneToAndroidAdaptor(new Iphone());
        android.isAndroid();
    }
}
