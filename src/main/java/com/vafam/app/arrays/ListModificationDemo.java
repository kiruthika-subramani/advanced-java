package com.vafam.app.arrays;

import java.util.ArrayList;
import java.util.List;


class ListModificationDemo {
    public static void main(String[] args) {
        List<String> starshipCrew = new ArrayList<>();
        starshipCrew.add("Captain Kirk");
        starshipCrew.add("Spock");
        starshipCrew.add("Dr. McCoy");

        starshipCrew.set(1, "Scotty");

        System.out.println("Welcome aboard the Starship, our crew members are: " + starshipCrew);
    }
}
