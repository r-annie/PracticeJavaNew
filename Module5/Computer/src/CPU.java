public class CPU {

    private final double cpuFrequency;
    private final int cpuCoresNumber;
    private final String cpuManufacturer;
    private final double cpuWeight;

    public CPU(double cpuFrequency, int cpuCoresNumber, String cpuManufacturer, double cpuWeight) {
        this.cpuFrequency = cpuFrequency;
        this.cpuCoresNumber = cpuCoresNumber;
        this.cpuManufacturer = cpuManufacturer;
        this.cpuWeight = cpuWeight;
    }

    public double getCpuFrequency() {        return cpuFrequency;    }

    public int getCpuCoresNumber() {        return cpuCoresNumber;    }

    public String getCpuManufacturer() {        return cpuManufacturer;    }

    public double getCpuWeight() {        return cpuWeight;    }

    public String toString () {
        return "Частота процессора:" + cpuFrequency + ", Кол-во ядер:" + cpuCoresNumber +
                ", Производитель:" + cpuManufacturer + ", Вес процессора:" + cpuWeight;
    }

}
