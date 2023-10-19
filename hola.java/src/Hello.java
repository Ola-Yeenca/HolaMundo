import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    // calcualting the avaerage fuel consumption of a car.

    Scanner input = new Scanner(System.in);

    // request for last 3 refueling from the user
    // first request: price per litre of the fuel, total paid to fil tank and number of km indicated at the odometer
    System.out.println("Enter the price per litre of the fuel: ");
    double pricePerLitre = input.nextDouble();
    System.out.println("Enter the total paid to fill tank: ");
    double totalPaid = input.nextDouble();
    System.out.println("Enter the number of km indicated at the odometer: ");
    double kmOdometer = input.nextDouble();

    // for the 2nd, the price per litre and total paid
    System.out.println("Enter the price per litre of the fuel: ");
    double pricePerLitre2 = input.nextDouble();
    System.out.println("Enter the total paid to fill tank: ");
    double totalPaid2 = input.nextDouble();

    // for the 3rd, the value of the odometer with consumption per 100km
    System.out.println("Enter the number of km indicated at the odometer: ");
    double kmOdometer2 = input.nextDouble();
    System.out.println("Enter the consumption per 100km: ");
    double consumptionPer100km = input.nextDouble();

    // calucating the total cost per km and average cost
    double totalCostPerKm = (totalPaid + totalPaid2) / (kmOdometer + kmOdometer2);
    double averageCost = (pricePerLitre + pricePerLitre2) / 2;

    //    calculating the amount of gas used in each trip
    double gasUsed = (kmOdometer2 - kmOdometer) / 100 * consumptionPer100km;
        if ((kmOdometer % 100 == 0)) {
          gasUsed = (kmOdometer2 - kmOdometer) / 100 * consumptionPer100km;
        } else {
          gasUsed = (kmOdometer2 - kmOdometer) / 100 * consumptionPer100km + 1;
        }


    // printing the results
    System.out.println("The total cost per km is: " + totalCostPerKm);
    System.out.println("The average cost is: " + averageCost);
    System.out.println("The amount of gas used in each trip is: " + gasUsed);

  }

}


