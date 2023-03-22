package main;

import main.gyak1.City;
import main.gyak1.WeekDay;
import main.gyak2.FibonacciSequence;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(City.BUDAPEST, City.LONDON, City.MADRID, City.BARCELONA);

        for (City city : cities) {
            System.out.println(city);
        }


        System.out.println(WeekDay.MON.nextDay(-7));

        System.out.println(WeekDay.MON.get("English"));

        System.out.println(FibonacciSequence.getWithRecursion(6));
        System.out.println(FibonacciSequence.getWithIteration(6));
    }
}
