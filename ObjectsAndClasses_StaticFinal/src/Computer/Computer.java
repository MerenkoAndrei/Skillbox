package Computer;

public class Computer {
    public static void main(String[] args) {
        Processor processor1 = new Processor(2.2,
                4, "AMD", 0.125);
        Random_access_memory R1 = new Random_access_memory("Kingston", 8, 0.130);
        Screen screen1 = new Screen(125, "Dexp", 2.152);
        Storage_of_information storageOfInformation1 =
                new Storage_of_information("WD Blue", 1000, 0.450);
        Keyboard keyboard1 = new Keyboard("Sven", "red", 0.650);
        Computer C1 = new Computer(Vender.ASER, "DEXP", processor1, R1, screen1, storageOfInformation1, keyboard1);
        System.out.println(C1);
        System.out.println("____________________________________");
        System.out.println("____________________________________");
        Processor processor2 = new Processor(2.7,
                6, "AMD_RISEN7", 0.130);
        Random_access_memory R2 = new Random_access_memory("Kingston", 16, 0.150);
        Screen screen2 = new Screen(136, "Dexp", 3.152);
        Storage_of_information storageOfInformation2 =
                new Storage_of_information("WD Blue", 1000, 0.450);
        Keyboard keyboard2 = new Keyboard("Sven", "Blak", 0.650);
        Computer C2 = new Computer(Vender.ASUS, "RISEN", processor2, R2, screen2, storageOfInformation2, keyboard2);
        System.out.println(C2);
    }

    public final Vender VENDER;
    public final String NAME;
    public Processor processor;
    public Random_access_memory randomAccessMemory;
    public Screen screen;
    public Storage_of_information storageOfInformation;
    public Keyboard keyboard;
    private static double totalWeight;

    public Computer(Vender VENDER, String NAME, Processor processor,
                    Random_access_memory randomAccessMemory, Screen screen,
                    Storage_of_information storageOfInformation, Keyboard keyboard) {
        this.VENDER = VENDER;
        this.NAME = NAME;
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.screen = screen;
        this.storageOfInformation = storageOfInformation;
        this.keyboard = keyboard;
    }

    public Vender getVENDER() {
        return VENDER;
    }

    public String getNAME() {
        return NAME;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Random_access_memory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(Random_access_memory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Storage_of_information getStorageOfInformation() {
        return storageOfInformation;
    }

    public void setStorageOfInformation(Storage_of_information storageOfInformation) {
        this.storageOfInformation = storageOfInformation;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return totalWeight = processor.getWEIGHT() + randomAccessMemory.getWeight() + screen.getWeight() +
                storageOfInformation.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer: " +
                "Производитель - " + VENDER + "\n" +
                "Название - " + NAME + "\n" + processor + "\n" + randomAccessMemory + "\n" +
                screen + "\n" + storageOfInformation + "\n" + keyboard + "\n" +
                "Вес компьютера - " + getTotalWeight();

    }
}