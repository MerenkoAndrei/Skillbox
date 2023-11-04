package Computer;

public class Random_access_memory {           //Оперативная память
    private final String type;             // тип
    private final int memory_capacity;      //объём памяти
    private final double weight;            //вес

    public Random_access_memory(String type, int memory_capacity, double weight) {
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
        return "2)<Оперативная память>" + "\n" + "Производитель - " + type + ";" +
                "объём памяти - " + memory_capacity + "Гб" + ";" + "вес - " + weight + "гр.";
    }
}
