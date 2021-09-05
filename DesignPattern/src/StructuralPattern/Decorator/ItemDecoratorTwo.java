package StructuralPattern.Decorator;

public class ItemDecoratorTwo implements Item{
    private Item item;
    public ItemDecoratorTwo(Item item){
        this.item=item;
    }

    public void show(){
        System.out.println("this is at layer two");
        item.show();
    }
}
