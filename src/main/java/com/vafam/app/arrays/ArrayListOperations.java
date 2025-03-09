package com.vafam.app.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {
        public static void main(String[] args) {
        List<String> starShipcrewList = new ArrayList<>();
        starShipcrewList.add(0, "Alex");
        starShipcrewList.add(1, "Adam");
        System.out.println("Welcome aboard "+starShipcrewList.get(0)+"!");
        System.out.println("The total number of crew list "+starShipcrewList.size());
    }
}
    

