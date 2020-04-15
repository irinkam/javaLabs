public class ElectronicFactory {

    public Electronic createElectronic(String type)
    {
        Electronic electronic = null;

        if (type.equals("Notebook")) {
            electronic = new Notebook();
        }
        else if (type.equals("Phone")) {
            electronic = new Phone();
        }
        else if (type.equals("SmartWatch")){
            electronic = new SmartWatch();
        }
        else if (type.equals("TV")){
            electronic = new TV();
        }
        return electronic;
    }
}
