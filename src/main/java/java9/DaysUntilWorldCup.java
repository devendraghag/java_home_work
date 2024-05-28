package java9;

import java.time.LocalDate;

//Solution to Assignment 3 a
//how many days until the 2022 world cup ?
public class DaysUntilWorldCup {

    public static void main(String[] args) {

        //Football world cup starts on 21st November 2022.
        LocalDate worldCupStartDate = LocalDate.of(2022,11,21);

        LocalDate now = LocalDate.now();

        //datesUntil returns a Stream<LocalDate>
        //Incremental step of 1 day.

        long noOfDaysUntilWorldCup  = now.datesUntil(worldCupStartDate)
                                         .count();

        System.out.println("Football world cup starts in "  + noOfDaysUntilWorldCup+ " days");
    }
}
