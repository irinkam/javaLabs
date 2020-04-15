public class ElectronicStore {

    ElectronicFactory electronicFactory;

    public ElectronicStore(ElectronicFactory electronicFactory)
    {
        this.electronicFactory = electronicFactory;
    }

    public Electronic orderElectronic(String type)
    {
        Electronic electronic = electronicFactory.createElectronic(type);
        return electronic;
    }
}
