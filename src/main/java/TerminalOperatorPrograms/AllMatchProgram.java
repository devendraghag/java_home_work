package TerminalOperatorPrograms;

//Java code for Stream allMatch
//(Predicate predicate) to check whether
//all elements of this stream match
//the provided predicate.

import java.util.*;

//boolean allMatch(Predicate<? super T> predicate)
class AllMatchProgram {

    // Driver code
    public static void main(String[] args) {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 33, 333);

        // Check if all elements of stream
        // are divisible by 3 or not using
        // Stream allMatch(Predicate predicate)
        boolean answer = list.stream().allMatch(n -> n % 3 == 0);
        boolean ans = list.stream().allMatch(t -> t % 2 == 0);

        // Displaying the result
        System.out.println(answer);
        System.out.println(ans);
    }
}
