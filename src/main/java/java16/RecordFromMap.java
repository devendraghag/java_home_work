package java16;

import java.util.Map;
import java.util.stream.Collectors;

public class RecordFromMap {
    public static void main(String[] args) {

        var categories = Map.of(
                "Home and Kitchen","40% ",
                "Sports and Outdoors","21%",
                "Toys and Games","19%",
                "Beauty and Personal Care","19%",
                "Health, Household & Baby Care","18%");

        var popularItemsList =

                categories.entrySet()
                          .stream()
                          .map(PopularItems::new)
                          .collect(Collectors.toList());

        System.out.println(popularItemsList);
    }
}
