package CreationalPattern.AbstractFactory.Factory;

import CreationalPattern.AbstractFactory.Product.Chair;
import CreationalPattern.AbstractFactory.Product.Table;

public interface AbstractFactory {
    Chair makeChair();
    Table makeTable();
}
