import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Electronic> electronicList = new ArrayList<>();

        // допустим, что все устройства имеют одинаковый набор производителей и моделей
        String[] types = new String[]{"Notebook", "Phone", "SmartWatch", "TV"};
        String[] vendors = new String[]{"Samsung", "Lg", "Asus", "Lenovo"};
        String[] models = new String[]{"XL055", "XS564", "M-K23", "P P34", "RT-420"};

        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 4); // рандом типа устройства
            String type = types[a]; // определеем тип устройства
            int price;
            double diagonal;
            int k = (int) (Math.random() * 5); // переменная для рандома модели
            int v = (int) (Math.random() * 4); //рандом производителя
            switch (a) {
                case 0:
                    price = (int) (12000 + Math.random() * 60000); // рандом цены
                    diagonal = 15 + Math.random() * 5; // рандом диагонали
                    Notebook note = new Notebook(type, price, diagonal, vendors[v], models[k], "Windows 10", 16, true);
                    electronicList.add(note);
                    break;
                case 1:
                    price = (int) (5000 + Math.random() * 20000);
                    diagonal = 15 + Math.random() * 5;
                    Phone phone = new Phone(type, price, diagonal, vendors[v], models[k], "Android " + (int)(4 + Math.random() * 6), 8, 2, true);
                    electronicList.add(phone);
                    break;
                case 2:
                    price = (int) (1000 + Math.random() * 3000);
                    diagonal = 0.4 + Math.random() * 1.8;
                    SmartWatch smartWatch = new SmartWatch(type, price, diagonal, vendors[v], models[k], "Android Wear", 8, true, true, false);
                    electronicList.add(smartWatch);
                    break;
                case 3:
                    price = (int) (12000 + Math.random() * 30000);
                    diagonal = 20 + Math.random() * 10;
                    TV tv = new TV(type, price, diagonal, vendors[v], models[k], 170, "16:9");
                    electronicList.add(tv);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + a);
            }
        }
        Electronic currentElectronic;
        for (int i = 0; i < 10; i++) {
            currentElectronic = electronicList.get(i);
            currentElectronic.display();
        }

        for (int i = 0; i < 10; i++) {
            currentElectronic = electronicList.get(i);
            switch (currentElectronic.getType())
            {
                case ("Notebook"):
                    currentElectronic = new Charger(currentElectronic);
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
            System.out.println(currentElectronic.cost());
            System.out.println(currentElectronic.getType());
        }
    }
}
