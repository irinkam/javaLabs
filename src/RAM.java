public class RAM extends EquipmentDecorator { // конкретный декоратор оперативная память
        Electronic electronic;
        int size;
        int cost;

    public RAM(Electronic electronic, int size, int cost)
        {
            this.electronic = electronic;
            this.size = size;
            this.cost = cost;
        }

        public String getType ()
        {
            return electronic.getType() + ", With " + size + "GB RAM";
        }

        public int cost ()
        {
            return cost + electronic.cost();
        }
    }