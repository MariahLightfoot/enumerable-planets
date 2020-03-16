package org.launchcode.enumerableplanets.models;

public enum Planets {

    MERCURY("Mercury", 88, "Yes!"),
    VENUS("Venus", 225, "Yes, female hitchhikers."),
    EARTH("Earth", 365, "No!"),
    MARS("Mars", 687, "Yes, male hitchhikers."),
    JUPITER("Jupiter", 4333, "Sometimes."),
    SATURN("Saturn", 10759, "Take a chance."),
    URANUS("Uranus", 30687, "Wouldn't risk it."),
    NEPTUNE("Neptune", 60200, "Yes!");

    private final String name;
    private final int yearLength;
    private String friendlyToHitchhikers;

    Planets(String name, int yearLength, String friendlyToHitchhikers) {
        this.name = name;
        this.yearLength = yearLength;
        this.friendlyToHitchhikers = friendlyToHitchhikers;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getFriendlyToHitchhikers() {
        return friendlyToHitchhikers;
    }
}
