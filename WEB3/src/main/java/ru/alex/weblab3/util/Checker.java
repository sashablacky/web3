package ru.alex.weblab3.util;

import lombok.experimental.UtilityClass;

/**
 * Created by alex on 09/12/2022
 */
@UtilityClass
public class Checker {

    public boolean isOnPlot(double x, double y, double r) {
        return (x <= 0 && x >= -r && y <= 0 && y >= -r / 2 &&  Math.abs(x) +  Math.abs(y) * 2  <= Math.abs(r)) || //triangle
                (x >= 0 && x <= r && y >= 0 && y <= r/2) || //rectangle
                (x >= 0 && y <= 0 && Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r , 2)); //circle
    }
}
