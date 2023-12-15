package org.example;

/**
 * Тест кейс для тестирования паттерна Компоновщик
 *
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

abstract class GraphicTest {
    protected Graphic graphic;

    @BeforeEach
    void setUp() {
        graphic = createGraphic();
    }

    protected abstract Graphic createGraphic();

    @Test
    void testPrint() {
        // Проверка вывода на консоль
        // ...
    }
}

class EllipseTest extends GraphicTest {
    @Override
    protected Graphic createGraphic() {
        return new Ellipse();
    }
}

class CompositeGraphicTest extends GraphicTest {
    @Override
    protected Graphic createGraphic() {
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(new Ellipse());
        return compositeGraphic;
    }

    @Test
    void testAdd() {
        // Проверка добавления элементов
    }
}
