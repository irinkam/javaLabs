package Factory;

import ClassHierarchy.*;

public class SimpleElectronicFactory {

    public Electronic createElectronic(String type)
    {
        Electronic electronic = null;

        if (type.equals("ClassHierarchy.Notebook")) {
            electronic = new Notebook("ClassHierarchy.Notebook", 605000, 17.5, "Samsung", "XS-150", "Windows 10", true);
        }
        else if (type.equals("ClassHierarchy.Phone")) {
            electronic = new Phone("ClassHierarchy.Phone", 25600, 5.5, "Asus", "Zenfont 4", "Android 9", 2, true);
        }
        else if (type.equals("ClassHierarchy.SmartWatch")){
            electronic = new SmartWatch("ClassHierarchy.SmartWatch", 3200, 1.3, "Xiaomi", "Mi Band 4", "Android Wear", true, true, false);
        }
        else if (type.equals("ClassHierarchy.TV")){
            electronic = new TV("ClassHierarchy.TV", 35000, 32, "LG", "M900", 170, "16:9");
        }
        return electronic;
    }
}