package com.gmail.kulacholeg.task_03;

import com.gmail.kulacholeg.task_03.shape.Shape;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeSorter {
    private List<Shape> shapes;

    public ShapeSorter(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void setShapes(List<Shape> shapes){
        this.shapes = shapes;
    }

    public List<Shape> sortShapes(){
        return shapes.stream()
                .sorted(Comparator.comparingDouble(Shape::getVolume))
                .collect(Collectors.toList());
    }
}
