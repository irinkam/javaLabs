public class Charger extends EquipmentDecorator { // конкретный декоратор зарядное устройство
    Electronic electronic;

    public Charger (Electronic electronic)
    {
        this.electronic = electronic;
    }

    public String getType()
    {
        return electronic.getType() + ", With charger included";
    }

    public int cost()
    {
        return 800 + electronic.cost();
    }
}
