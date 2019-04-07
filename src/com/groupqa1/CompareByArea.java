package com.groupqa1;

import java.util.Comparator;

public class CompareByArea implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (int) ((Shape)o1).CalcArea() - (int) ((Shape)o2).CalcArea();
    }
}
