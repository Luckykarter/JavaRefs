package com.egorWexler;

/**
 * Test for JavaDoc
 * This class is for calculating area
 * @author egorwexler
 */
public class Square {
    /**
     * parameter
     */
    int sideLength;

    /**
     * Constructor
     * @param sideLength length of one side of the square
     */
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Calculates area
     * @return area of a square
     */
    public int calculateArea() {
        return sideLength * sideLength;
    }

}
