package Computer;

public class Screen {                                  // Экран
    private final double diagonal;        // диагональ
    private final String type;             // тип
    private final double weight;            //вес

    public Screen(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "3)<Монитор>" + "\n" + "диагональ - " + diagonal + ";" +
                "Производитель - " + type + ";" + "Вес - " + weight + "гр";
    }
}
