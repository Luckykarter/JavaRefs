package com.egorWexler;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<Building>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        List<Office> offices = new ArrayList<Office>();
        offices.add(new Office());
        printBuildings(offices);



    }

    // now I can pass any types that extend Building class
    // in - variable - makes sense to use extends
    public static void printBuildings(List<? extends Building> b) {
        for(Building building: b) {
            System.out.println(building);
        }
    }

    // out variable - makes sense to use super
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());

    }

}
