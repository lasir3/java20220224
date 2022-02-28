package Chap99.CodingBat.Logic1;

public class C06Logic1_AlarmClock {

    // Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a
    // boolean indicating if we are on vacation, return a string of the form "7:00"
    // indicating when the alarm clock should ring. Weekdays, the alarm should be
    // "7:00" and on the weekend it should be "10:00". Unless we are on vacation --
    // then on weekdays it should be "10:00" and weekends it should be "off".

    // alarmClock(1, false) → "7:00"
    // alarmClock(5, false) → "7:00"
    // alarmClock(0, false) → "10:00"
    // alarmClock(2, true) → "10:00"
    // alarmClock(6, true) → "off"

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
        System.out.println(alarmClock(2, true));
        System.out.println(alarmClock(6, true));

    }

    public static String alarmClock(int day, boolean vacation) {
        // if (vacation) {
        //     switch (day) {
        //         case 0:
        //         case 6:
        //             return "off";
        //         default :
        //             return "10:00";
        //     }
        // } else {
        //     switch (day) {
        //         case 0:
        //         case 6:
        //             return "10:00";
        //         default :
        //             return "7:00";
        //     }
        // }

        String early;
        String late;
        if (vacation) {
            early = "10:00";
            late = "off";
        } else {
            early = "7:00";
            late = "10:00";
        }
        String result = "";
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = early;
                break;
            case 6:
            case 0:
                result = late;
        }
        return result;
    }
}
