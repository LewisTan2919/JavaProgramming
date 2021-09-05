package StructuralPattern.Decorator;

public class run {
    public static void main(String[] args) {

        ItemDecoratorOne itemDecoratorOne=new ItemDecoratorOne();
        ItemDecoratorTwo itemDecoratorTwo=new ItemDecoratorTwo(itemDecoratorOne);

        itemDecoratorTwo.show();
    }
}
