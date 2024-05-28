package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<String> value1 = i -> System.out.println("i2");
        Consumer<String> value2 = i -> System.out.println("i3");
        value1.andThen(value2).accept("5");

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        List<String> list2 = new ArrayList<>();
        list2.add("F");

        list1.forEach(value1.andThen(value2));
    }
}
