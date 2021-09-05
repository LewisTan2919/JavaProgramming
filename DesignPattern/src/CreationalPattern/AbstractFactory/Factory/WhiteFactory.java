package CreationalPattern.AbstractFactory.Factory;

import CreationalPattern.AbstractFactory.Product.Chair;
import CreationalPattern.AbstractFactory.Product.Table;
import CreationalPattern.AbstractFactory.Product.WhiteChair;
import CreationalPattern.AbstractFactory.Product.WhiteTable;

public class WhiteFactory implements AbstractFactory {
    @Override
    public Chair makeChair() {
        return new WhiteChair();
    }

    @Override
    public Table makeTable() {
        return new WhiteTable();
    }
}
