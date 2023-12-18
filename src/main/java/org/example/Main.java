
import java.util.ArrayList;
import java.util.List;

// Общий интерфейс для элементов и контейнеров
interface Graphic {
    void print();
}

// Класс компонент для элементов
class Ellipse implements Graphic {
    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}

// Класс компонент для контейнеров
class CompositeGraphic implements Graphic {
    private final List<Graphic> graphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic : graphics) {
            graphic.print();
        }
    }

    // Элементы управления для контейнеров
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic.add(graphic1);
        graphic.add(ellipse3);
        graphic.remove(graphic1);
        graphic.remove(ellipse1);

        graphic.print();
    }
}
