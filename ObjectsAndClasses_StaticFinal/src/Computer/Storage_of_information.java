package Computer;

public class Storage_of_information {           //Накопитель информации
    private final String type;             // тип
    private final int memory_capacity;      //объём памяти
    private final double weight;            //вес

    public Storage_of_information(String type, int memory_capacity, double weight) {
        this.type = type;
        this.memory_capacity = memory_capacity;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getMemory_capacity() {
        return memory_capacity;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "4)<Накопитель информации>" + "\n" + "Производитель - " + type + ";" +
                "объём памяти - " + memory_capacity + ";" + "Вес - " + weight + "гр";
    }
}
