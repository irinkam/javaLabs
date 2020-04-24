package Decorator;

import ClassHierarchy.Electronic;

public abstract class EquipmentDecorator extends Electronic { // абстрактный декоратор оборудования в комплекте
    public abstract String getType();
}
