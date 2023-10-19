package src;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int day, month, year;

        Scanner sc = new Scanner(System.in);
        System.out.println("What's the year?: ");
        year = sc.nextInt();
        System.out.println("What's the month?: ");
        month = sc.nextInt();
        System.out.println("What's the day?: ");
        day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        String season = getSeason(date);

        if (season != null) {
            System.out.println("Season for " + date + " is " + season);
        } else {
            System.out.println("Invalid date: " + date);
        }

        sc.close();
    }

    public static String getSeason(LocalDate date) {
        int dayOfYear = date.getDayOfYear();

        if (date.isLeapYear() && date.getMonth() == Month.FEBRUARY && date.getDayOfMonth() == 29) {
            return "Winter";
        } else if ((dayOfYear >= 80 && dayOfYear < 172) || (dayOfYear >= 266 && dayOfYear < 355)) {
            return "Spring";
        } else if (dayOfYear >= 172 && dayOfYear < 266) {
            return "Summer";
        } else if (dayOfYear >= 355 || (dayOfYear >= 0 && dayOfYear < 80)) {
            return "Autumn";
        } else {
            return null;
        }
    }
}
