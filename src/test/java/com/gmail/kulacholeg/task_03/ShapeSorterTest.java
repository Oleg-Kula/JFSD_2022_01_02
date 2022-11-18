package com.gmail.kulacholeg.task_03;

import com.gmail.kulacholeg.task_03.shape.Shape;
import com.gmail.kulacholeg.task_03.shape.shapeImpl.Ball;
import com.gmail.kulacholeg.task_03.shape.shapeImpl.Cube;
import com.gmail.kulacholeg.task_03.shape.shapeImpl.Cylinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeSorterTest {

    @Test
    void sortShapes() {
        Shape ball = new Ball(10); //V=4189
        Shape cylinder = new Cylinder(9, 3); //V=27
        Shape cube = new Cube(5); //V=125

        List<Shape> shapes = new ArrayList<>();
        shapes.add(ball);
        shapes.add(cylinder);
        shapes.add(cube);

        ShapeSorter sorter = new ShapeSorter(shapes);

        assertEquals(27, sorter.sortShapes().get(0).getVolume());
        assertEquals(125, sorter.sortShapes().get(1).getVolume());
        assertEquals(4189, sorter.sortShapes().get(2).getVolume());

    }
}