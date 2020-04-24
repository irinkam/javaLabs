package Decorator;

import ClassHierarchy.Electronic;
import Decorator.EquipmentDecorator;

public class RemoteController extends EquipmentDecorator { // конкретный декоратор пульт ДУ
    Electronic electronic;

    public RemoteController  (Electronic electronic)
    {
        this.electronic = electronic;
    }

    public String getType()
    {
        return electronic.getType() + ", With remote controller included";
    }

    public int cost()
    {
        return 750 + electronic.cost();
    }
}
