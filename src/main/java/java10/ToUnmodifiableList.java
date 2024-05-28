package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiableList {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Mumbai");
        cityList.add("London");
        cityList.add("Bangalore");
        cityList.add("New York");
        cityList.add("Pune");

        List<String> unModifiableCityList = cityList.stream()
                .map((String s) -> s.toUpperCase())
                .collect(Collectors.toUnmodifiableList());

        cityList.add("Chennai");
   //     unModifiableCityList.add("Chennai");

        System.out.println(cityList);
        System.out.println(unModifiableCityList);

    }
}
