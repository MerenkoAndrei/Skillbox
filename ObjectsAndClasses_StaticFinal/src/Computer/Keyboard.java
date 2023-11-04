package Computer;

public class Keyboard {                      // клавиатура
    private final String type;               // тип
    private final String illumination;       //подсветка
    private final double weight;             //вес

    public Keyboard(String type, String illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getIllumination() {
        return illumination;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "5)<клавиатура> " + "\n" + "Производитель - " + type + ";" + "подсветка - " + illumination + ";" +
                "Вес - " + weight + "гр.";
    }
}
