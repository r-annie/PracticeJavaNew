public class Computer {

    private final String vendor;
    private final String name;
    private CPU cpu;
    private RAM ram;
    private ROM rom;
    private Screen screen;
    private Keyboard keyboard;

    public Computer (String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer (String vendor, String name, CPU cpu, RAM ram, ROM rom, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {        return vendor;    }

    public String getName() {        return name;    }

    public CPU getCpu() { return cpu; }

    public RAM getRam() { return ram; }

    public ROM getRom() { return rom; }

    public Screen getScreen() { return screen; }

    public CPU setCpu(double cpuFrequency, int cpuCoresNumber, String cpuManufacturer, double cpuWeight) {
        this.cpu = new CPU(cpuFrequency,cpuCoresNumber,cpuManufacturer,cpuWeight);
        return cpu;
    }

    public RAM setRam(String ramType, int ramMemory, double ramWeight) {
        this.ram = new RAM(ramType, ramMemory, ramWeight);
        return ram;
    }

    public ROM setRom(TypeROM romType, int romMemory, double romWeight) {
        this.rom = new ROM(romType, romMemory, romWeight);
        return rom;
    }

    public Screen setScreen(double screenDiagonal,TypeOfScreen screenType,double screenWeight) {
        this.screen = new Screen(screenDiagonal,screenType,screenWeight);
        return screen;
    }

    public Keyboard setKeyboard(String keyboardType,boolean keyboardBacklight, double keyboardWeight) {
        this.keyboard = new Keyboard(keyboardType,keyboardBacklight,keyboardWeight);
        return keyboard;
    }

    public Keyboard getKeyboard() { return keyboard; }

    public double getTotalWeight() {
        return cpu.getCpuWeight() + ram.getRamWeight() + rom.getRomWeight() + screen.getScreenWeight() +
                keyboard.getKeyboardWeight();
    }

    public String toString () {
        return "Производитель ПК: " + vendor + " Название ПК: " + name + "\n" +
                cpu + "\n" + ram + "\n" +  rom + "\n" +  screen + "\n" +  keyboard;
    }
}