package java16;


import java.util.Objects;

public class Location{

    private String country;
    private String city;

    public Location(String country, String city){
        this.country=country;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(country, location.country) && Objects.equals(city, location.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}