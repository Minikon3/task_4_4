public class Main {
    public static void main(String[] args) {
        Computer[] computers = {
            new Computer(Brand.HP,new Processor("Intel",8,3),new Memory(8000),new Monitor(1920,1080)),
            new Computer(Brand.ASUS,new Processor("AMD",6,4),new Memory(16000),new Monitor(2560,1440)),
            new Computer(Brand.LENOVO,new Processor("Intel",12,4),new Memory(32000),new Monitor(3840,2160)),
            new Computer(Brand.DELL,new Processor("AMD",2,2),new Memory(2000),new Monitor(1024,768)),
        };
        for (int i=0;i< computers.length;i++){
            System.out.println(computers[i]);
        }
    }
}