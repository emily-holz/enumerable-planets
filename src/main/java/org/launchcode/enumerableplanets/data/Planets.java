package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune",60200);

    private final String name;

    private final double yearLength;

   Planets(String name, double yearLength){
        this.name = name;
        this.yearLength=yearLength;
    }

    public String getName() {
        return name;
    }

    public double getYearLength() {
        return yearLength;
    }
}
