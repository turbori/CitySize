/*
Define a method printCitySize() that takes one string parameter and one integer parameter and outputs as follows, ending with a newline. The method should not return any value.

Ex: If the input is Jacksonville 821784, then the output is:

Jacksonville has 821784 people.
 */

import java.util.Scanner;



public class CitySize {

    /* Your code goes here */

    public static void printCitySize(String city, int population){
        System.out.println(city + " has " + population + " people.");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String cityName;
        int citySize;

        cityName = scnr.next();
        citySize = scnr.nextInt();

        printCitySize(cityName, citySize);
    }
}