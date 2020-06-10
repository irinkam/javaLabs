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
        return new SamsungNotebook.Builder()
                .diagonal(17)
                .model("XLL-5")
                .price(35500)
                .os("Windows 10")
                .cd(true)
                .build();
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
