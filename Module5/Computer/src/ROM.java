public class ROM {

    private final TypeROM romType;
    private final int romMemory;
    private final double romWeight;

    public ROM(TypeROM romType,int romMemory,double romWeight) {
        this.romType = romType;
        this.romMemory = romMemory;
        this.romWeight = romWeight;
    }

    public TypeROM getRomType() {
        return romType;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public double getRomWeight() {
        return romWeight;
    }

    public String toString () {
        return "Тип оперативной памяти:" + romType + ", Объем оперативной памяти:" + romMemory +
                ", Вес оперативной памяти:" + romWeight;
    }
}
