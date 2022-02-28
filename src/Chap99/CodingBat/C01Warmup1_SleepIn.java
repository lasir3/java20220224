package Chap99.CodingBat;

public class C01Warmup1_SleepIn {

    // The parameter weekday is true if it is a weekday, and the parameter vacation
    // is true if we are on vacation. We sleep in if it is not a weekday or we're on
    // vacation. Return true if we sleep in.

    // sleepIn(false, false) → true
    // sleepIn(true, false) → false
    // sleepIn(false, true) → true

    public static void main(String[] args) {

        System.out.println(sleepIn(true, true));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(false, false));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}
