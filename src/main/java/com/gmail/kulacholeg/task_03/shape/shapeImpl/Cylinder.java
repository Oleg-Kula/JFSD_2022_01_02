package com.gmail.kulacholeg.task_03.shape.shapeImpl;

import com.gmail.kulacholeg.task_03.shape.Shape;

public class Cylinder implements Shape {
    private int baseArea;
    private int height;

    public Cylinder(int baseArea, int height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public int calculateSize() {
        return baseArea*height;
    }
}
