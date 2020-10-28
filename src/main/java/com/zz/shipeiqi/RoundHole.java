package com.zz.shipeiqi;

/**
 * 圆孔
 *
 * @since 1.0
 */
public class RoundHole {
    //半径
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
