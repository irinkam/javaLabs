public class SmartDevices extends Electronic{
    private String os;
    private int RAM;

    SmartDevices(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM) {
        super(newType, newPrice, newDiagonal, newVendor, newModel);
        this.os = newOs;
        this.RAM = newRAM;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\t\t OS = " + this.os + "\t\t RAM = " + this.RAM + "Gb");
    }
}
