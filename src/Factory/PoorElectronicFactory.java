package Factory;

import ClassHierarchy.*;
import Factory.ElectronicStore;

public class PoorElectronicFactory extends ElectronicStore {

    public Electronic createElectronic(String type)
    {
        Electronic electronic = null;

        if (type.equals("Notebook")) {
            electronic = new Notebook("Notebook", 205000, 15, "Samsung", "XXS-MD 15", "Windows 10", true);
        }
        else if (type.equals("Phone")) {
            electronic = new Phone("Phone", 8000, 5, "Asus", "Zenfone 3", "Android 8", 2, true);
        }
        else if (type.equals("SmartWatch")){
            electronic = new SmartWatch("SmartWatch", 1500, 1.3, "Xiaomi", "Mi Band 3", "Android Wear", true, true, false);
        }
        else if (type.equals("TV")){
            electronic = new TV("TV", 17000, 24, "LG", "Z300", 120, "16:9");
        }
        return electronic;
    }
}
