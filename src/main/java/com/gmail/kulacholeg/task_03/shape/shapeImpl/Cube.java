package com.gmail.kulacholeg.task_03.shape.shapeImpl;

import com.gmail.kulacholeg.task_03.shape.Shape;

public class Cube implements Shape {

    private int side;

    public Cube(int side){
        this.side = side;
    }

    @Override
    public int calculateSize() {
        return (int)Math.pow(side, 3);
    }
}
