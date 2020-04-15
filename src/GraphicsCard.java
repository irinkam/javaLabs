public class GraphicsCard extends EquipmentDecorator {//конкретный декоратор видеокарта
    Electronic electronic;
    String name;
    int cost;

    public GraphicsCard(Electronic electronic, String name, int cost)
    {
        this.electronic = electronic;
        this.name = name;
        this.cost = cost;
    }

    public String getType ()
    {
        return electronic.getType() + ", Graphics Card: " + name;
    }

    public int cost ()
    {
        return cost + electronic.cost();
    }
}