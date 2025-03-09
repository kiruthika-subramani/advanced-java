package com.vafam.app.hashmap;

import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        HashMap<String, String> crewRoles = new HashMap<>();
        crewRoles.put("Biologist", "Zara");
        crewRoles.put("Geologist", "Li");
        crewRoles.put("Astronomer", "Omar");
        System.out.println("The Biologist is " + crewRoles.get("Biologist") + ".");
        System.out.println("The pilot is "+crewRoles.getOrDefault("Pilot", "Unknown role"));
    
}
    
}
