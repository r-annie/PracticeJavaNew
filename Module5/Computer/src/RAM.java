public class RAM {

    private final String ramType;
    private final int ramMemory;
    private final double ramWeight;

    public RAM(String ramType, int ramMemory, double ramWeight) {
        this.ramType = ramType;
        this.ramMemory = ramMemory;
        this.ramWeight = ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public String toString () {
        return "Тип ПЗУ:" + ramType + ", Объем ПЗУ:" + ramMemory +
                ", Вес ПЗУ:" + ramWeight;
    }
}
