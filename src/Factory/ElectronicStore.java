package Factory;

import ClassHierarchy.Electronic;

public class ElectronicStore {

    SimpleElectronicFactory electronicFactory;

    public ElectronicStore(SimpleElectronicFactory electronicFactory)
    {
        this.electronicFactory = electronicFactory;
    }

    public Electronic orderElectronic(String type)
    {
        Electronic electronic = electronicFactory.createElectronic(type);
        electronic.assemble();
        electronic.box();

        System.out.println(type + " is ready!");
        return electronic;
    }
}
