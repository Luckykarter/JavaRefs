package com.egorWexler;

public class Main {

    /**
     * Example for the method reference
     * @param args
     */
    public static void main(String[] args) {
        Square s = new Square(4);

        /**
         * pass method reference to define interface
          */


        //this is the same as
        Shapes shapes = Square::calculateArea;

        //this
        Shapes shapes1 = (Square square) -> {
            return square.calculateArea();
        }

        System.out.println(shapes.getArea(s));
    }
}
