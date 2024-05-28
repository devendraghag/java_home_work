package java14;

import java.util.Objects;

public class Location {

    private String name;
    private double longitude;
    private double latitude;


    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    public static void main(String[] args) {
        Location loc1 = new Location("India", 20.5937, 78.9629);
        Location loc2 = new Location("India",    20.5937, 78.9629);

        System.out.println(loc1.equals(loc2));
    }

    @Override
    public boolean equals(Object o) {

        return   (o instanceof  Location location) &&
                 Double.compare(location.longitude, longitude) == 0 &&
                 Double.compare(location.latitude, latitude) == 0 &&
                 Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, longitude, latitude);
    }
}
