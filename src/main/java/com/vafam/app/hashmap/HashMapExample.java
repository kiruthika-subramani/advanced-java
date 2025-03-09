package com.vafam.app.hashmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> spaceShipRoles = new HashMap<>();
        spaceShipRoles.put("Alex", "Pilot");
        spaceShipRoles.put("Adam","Commander");
        spaceShipRoles.put("Aron", "Mechanic");
        System.out.println("Alex's role is: "+spaceShipRoles.get("Alex"));
        System.out.println("Adam's role is: "+spaceShipRoles.get("Adam"));
        System.out.println("Aron's role is: "+spaceShipRoles.get("Aron"));
        System.out.println("Do we have a doctor: "+spaceShipRoles.containsKey("Doctor"));
    }
    
}
