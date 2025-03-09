package com.vafam.app.hashset;

import java.util.HashSet;

public class HastSetexample {
    public static void main(String[] args) {
        HashSet<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Venus");
        System.out.println("Number of unique planets: " + planets.size());
        System.out.println("Unique planets: " + planets);
        System.out.println(planets.contains("Earth"));
    
}
    
}
