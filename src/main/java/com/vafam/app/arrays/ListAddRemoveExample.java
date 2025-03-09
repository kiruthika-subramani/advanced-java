package com.vafam.app.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListAddRemoveExample {
 
    public static void main(String[] args) {
   
        List<String> crewRoles = new ArrayList<>();
        crewRoles.add(0, "Commander");
        crewRoles.add(1,"Navigator");
        crewRoles.add(2, "Scientist");
        crewRoles.remove(1);
        System.out.println(crewRoles); 
    }
}
    

