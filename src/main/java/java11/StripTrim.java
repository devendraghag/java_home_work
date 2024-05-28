package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StripTrim {
    public static void main(String[] args) {
        String str1 = "  Hello World  ";
        System.out.println(str1.strip());
        System.out.println(str1.stripLeading());
        System.out.println(str1.stripTrailing());
        System.out.println(str1.trim());

        List<String> listOfStrings = Arrays.asList(" ", "\t", "\n", "One", "Two", "Three");
        // before 11
        List<String> blankStrings = listOfStrings.stream().filter(String::isBlank).collect(Collectors.toList()); // empty
        List<String> nonBlankStrings = listOfStrings.stream().filter(str -> ! str.isBlank()).collect(Collectors.toList()); //not empty

        //after 11
        List<String> nonBlankStrings11 = listOfStrings.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());


    }
}
