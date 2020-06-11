package com.company;

public class Overrides {
    public static class Building {
        @Override
        public String toString() {
            return("building");
        }
    }

    public static class Office extends Building {
        @Override
        public String toString() {
            return("office");
        }
    }

    public static void printBuilding(Building b){
        System.out.println("Building: " + b);
    }


}

