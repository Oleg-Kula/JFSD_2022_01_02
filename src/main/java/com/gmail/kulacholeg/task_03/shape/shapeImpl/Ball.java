package com.gmail.kulacholeg.task_03.shape.shapeImpl;

import com.gmail.kulacholeg.task_03.shape.Shape;

public class Ball implements Shape {
    private int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateSize() {
        return (int)Math.round(4.0/3 * Math.PI * Math.pow(radius, 3));
    }
}
