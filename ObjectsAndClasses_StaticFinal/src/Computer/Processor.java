package Computer;

public class Processor {
    private final double FREQUENCY_RESPONSE; //частота
    private final int NUMBER_OF_CORES;       //количество ядер
    private final String MANUFACTURER;       //производитель
    private final double WEIGHT;             //вес

    public Processor(double FREQUENCY_RESPONSE, int NUMBER_OF_CORES, String MANUFACTURER, double WEIGHT) {
        this.FREQUENCY_RESPONSE = FREQUENCY_RESPONSE;
        this.NUMBER_OF_CORES = NUMBER_OF_CORES;
        this.MANUFACTURER = MANUFACTURER;
        this.WEIGHT = WEIGHT;

    }

    public double getFREQUENCY_RESPONSE() {
        return FREQUENCY_RESPONSE;
    }

    public int getNUMBER_OF_CORES() {
        return NUMBER_OF_CORES;
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "1)<Процессор компьютера> " + "\n" + "Частота - " + FREQUENCY_RESPONSE + "Ггц" +
                ";" + "количество ядер - " + NUMBER_OF_CORES + ";" + "Производитель - " +
                MANUFACTURER + ";" + "Вес - " + WEIGHT + "гр";
    }
}





