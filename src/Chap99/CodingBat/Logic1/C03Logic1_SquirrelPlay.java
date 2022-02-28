package Chap99.CodingBat.Logic1;

public class C03Logic1_SquirrelPlay {

    // The squirrels in Palo Alto spend most of the day playing. In particular, they
    // play if the temperature is between 60 and 90 (inclusive). Unless it is
    // summer, then the upper limit is 100 instead of 90. Given an int temperature
    // and a boolean isSummer, return true if the squirrels play and false
    // otherwise.

    // squirrelPlay(70, false) → true
    // squirrelPlay(95, false) → false
    // squirrelPlay(95, true) → true
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

}
