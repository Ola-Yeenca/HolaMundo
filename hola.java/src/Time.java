import java.util.Scanner;

public class Time {
  public static void main (String[] args) {
    // request the amount of time in seconds and covert and display it to days , hours minutes and seconds

    Scanner input = new Scanner(System.in);
    System.out.println("Introduce la hora en segundas: ");


    int sec = Integer.parseInt(input.nextLine());
    int day=sec/86400;
    int hour=(sec%86400)/3600;
    int min=((sec%86400)%3600)/60;
    int seconds=((sec%86400)%3600)%60;

    // ask for time in seconds

    System.out.println(day + " days, " + hour + " hours, " + min + " minutes, " + seconds + " seconds");

  }
}
