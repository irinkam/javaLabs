package AbstractFactory;

import AbstractFactory.Samsung.*;
import ClassHierarchy.Notebook;
import ClassHierarchy.Phone;
import ClassHierarchy.SmartWatch;
import ClassHierarchy.TV;
import Decorator.GraphicsCard;
import Decorator.RAM;

public class SamsungFactory implements ElectronicFactory {
    @Override
    public Notebook createNotebook() {
        Notebook note = new SamsungNotebook("Notebook", 205000, 15, "Samsung", "XXS-MD 15", "Windows 10", true);
        //note = new RAM(note, 4, 500);
        return note;
    }

    @Override
    public Phone createPhone() {
        return new SamsungPhone("Phone", 25600, 5.5, "Samsung", "Zenfon 4", "Android 9", 2, true);
    }

    @Override
    public SmartWatch createSmartWatch() {
        return new SamsungSmartWatch("SmartWatch", 3200, 1.3, "Samsung", "Mi Band 4", "Android Wear", true, true, false);
    }

    @Override
    public TV createTV() {
        return new SamsungTV("TV", 35000, 32, "Samsung", "M900", 170, "16:9");
    }
}
