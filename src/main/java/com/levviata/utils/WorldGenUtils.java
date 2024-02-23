package com.levviata.utils;

public class WorldGenUtils {
    public static int preferMaxY(int minY, int maxY, int deltaY) {
        deltaY = (maxY / 2)- minY;
        return deltaY;
    }
    public static int preferMinY(int minY, int maxY, int deltaY) {
        deltaY = maxY- (minY / 2);
        return deltaY;
    }
}
