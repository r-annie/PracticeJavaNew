public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Miki","V4");
        computer.setCpu(2.3,3,"Inte",0.3);
        computer.setRam("DDR3",4,0.1);
        computer.setRom(TypeROM.SSD,512,0.4);
        computer.setScreen(15,TypeOfScreen.IPS,0.6);
        computer.setKeyboard("wireless",true,0.2);

        System.out.println(computer);
        System.out.println("Суммарный вес всех компектующих ПК: " + computer.getTotalWeight());
    }
}
