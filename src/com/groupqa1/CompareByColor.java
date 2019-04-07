package com.groupqa1;

import java.util.Comparator;

public class CompareByColor implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
