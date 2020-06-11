package com.company;

public class Overrides {
    public static class Building {
        @Override
        public String toString() {
            return("blabla");
        }
    }

    public static class Office extends Building {
        @Override
        public String toString() {
            return("office");
        }
    }


}

