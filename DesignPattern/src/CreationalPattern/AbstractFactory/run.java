package CreationalPattern.AbstractFactory;

import CreationalPattern.AbstractFactory.Factory.AbstractFactory;
import CreationalPattern.AbstractFactory.Factory.BlackFactory;
import CreationalPattern.AbstractFactory.Factory.WhiteFactory;
import CreationalPattern.AbstractFactory.Product.Chair;
import CreationalPattern.AbstractFactory.Product.Table;

public class run {

    public static void main(String[] args) {
        AbstractFactory whiteFactory=getFactory("white");
        AbstractFactory blackFactory=getFactory("black");
        productInfo(whiteFactory);
        productInfo(blackFactory);
    }

    public static AbstractFactory getFactory(String color){
        if(color.equals("white")){
            return new WhiteFactory();
        }else{
            return new BlackFactory();
        }
    }

    public static void productInfo(AbstractFactory factory){
        Chair chair=factory.makeChair();
        Table table=factory.makeTable();
        System.out.println("chair:\n color: "+chair.color()+"   size"+chair.size());
        System.out.println("Table:\n color: "+table.color()+"   size"+table.size());
    }

}
