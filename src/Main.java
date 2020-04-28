import ClassHierarchy.*;
import Decorator.*;
import Factory.ElectronicStore;
import Factory.LuxuryElectronicFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Electronic> electronicList = new ArrayList<>();

        // допустим, что все устройства имеют одинаковый набор производителей и моделей
        String[] types = new String[]{"Notebook", "Phone", "SmartWatch", "TV"};
        String[] vendors = new String[]{"Samsung", "Lg", "Asus", "Lenovo"};
        String[] models = new String[]{"XL055", "XS564", "M-K23", "P P34", "RT-420"};

        System.out.println("\n**********SIMPLE FACTORY**********\n");
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 4); // рандом типа устройства
            String type = types[a]; // определяем тип устройства

            ElectronicStore electronicStore;
            electronicStore = new LuxuryElectronicFactory();
            Electronic electronic;

            switch (a) {
                case 0:
                    electronic = electronicStore.orderElectronic("Notebook");
                    break;
                case 1:
                    electronic = electronicStore.orderElectronic("Phone");
                    break;
                case 2:
                    electronic = electronicStore.orderElectronic("SmartWatch");
                    break;
                case 3:
                    electronic = electronicStore.orderElectronic("TV");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + a);
            }
           electronicList.add(electronic);
        }

        System.out.println("\n**********INFO**********\n");
        Electronic currentElectronic;
        for (int i = 0; i < 10; i++) {
            currentElectronic = electronicList.get(i);
            currentElectronic.display();
        }
        // декорация
        System.out.println("\n**********DECORATORS**********\n");
        for (int i = 0; i < 10; i++) {
            currentElectronic = electronicList.get(i);
            switch (currentElectronic.getType())
            {
                case ("Notebook"):
                    currentElectronic = new RAM(currentElectronic, 4, 1200);
                    currentElectronic = new GraphicsCard(currentElectronic, "GeForce GTX 1020", 12300);
                    break;
                case ("Phone"):
                    currentElectronic = new Charger(currentElectronic);
                    currentElectronic = new Headphones(currentElectronic);
                    break;
                case("SmartWatch"):
                    currentElectronic = new Charger(currentElectronic);
                    break;
                case("TV"):
                    currentElectronic = new RemoteController(currentElectronic);
                    break;
            }

            System.out.print(currentElectronic.getType());
            System.out.println(", " + currentElectronic.cost() + " rub.");
        }
    }
}
