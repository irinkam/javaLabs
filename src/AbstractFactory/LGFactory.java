package AbstractFactory;

import AbstractFactory.LG.*;
import ClassHierarchy.*;

public class LGFactory implements ElectronicFactory {
    @Override
    public Notebook createNotebook() {
        return new LGNotebook("Notebook", 205000, 15, "LG", "XXS-MD 15", "Windows 10", true);
    }

    @Override
    public Phone createPhone() {
        return new LGPhone("Phone", 8000, 5, "LG", "Zenfone 3", "Android 8", 2, true);
    }

    @Override
    public SmartWatch createSmartWatch() {
        return new LGSmartWatch("SmartWatch", 1500, 1.3, "LG", "Mi Band 3", "Android Wear", true, true, false);
    }

    @Override
    public TV createTV() {
        return new LGTV("TV", 17000, 24, "LG", "Z300", 120, "16:9");
    }
}
