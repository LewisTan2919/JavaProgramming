package CreationalPattern.AbstractFactory.Factory;

import CreationalPattern.AbstractFactory.Product.BlackChair;
import CreationalPattern.AbstractFactory.Product.BlackTable;
import CreationalPattern.AbstractFactory.Product.Chair;
import CreationalPattern.AbstractFactory.Product.Table;

public class BlackFactory implements AbstractFactory {
    @Override
    public Chair makeChair() {
        return new BlackChair();
    }

    @Override
    public Table makeTable() {
        return new BlackTable();
    }
}
