package Factory;

import ClassHierarchy.Electronic;

public abstract class ElectronicStore {

    public Electronic orderElectronic(String type)
    {
        Electronic electronic;

        electronic = createElectronic(type);

        electronic.assemble();
        electronic.box();

        System.out.println(type + " is ready!");
        return electronic;
    }

    abstract Electronic createElectronic(String type);
}
