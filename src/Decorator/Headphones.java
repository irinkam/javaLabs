package Decorator;

import ClassHierarchy.Electronic;
import Decorator.EquipmentDecorator;

public class Headphones extends EquipmentDecorator { // конкретный декоратор наушники
    Electronic electronic;

    public Headphones (Electronic electronic)
    {
        this.electronic = electronic;
    }

    public String getType()
    {
        return electronic.getType() + ", With headphones included";
    }

    public int cost()
    {
        return 1200 + electronic.cost();
    }
}
