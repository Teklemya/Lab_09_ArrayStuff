import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Random gen = new Random();

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = gen.nextInt(100) + 1; // set all to 1 to 100
        }


        for (int i = 0; i < dataPoints.length; i++)
            System.out.printf("%4d", dataPoints[i]);

        System.out.println("\n");

        for (int i = 0; i < dataPoints.length; i++)
            System.out.print(" | " + dataPoints[i]);

        System.out.println("\n");

        int sum = 0;
        double ave = 0;

        for (int i = 0; i < dataPoints.length; i++)
            sum += dataPoints[i];

        System.out.println("The sum of dataPoints is " + sum);


        ave = (double) sum / dataPoints.length;

        System.out.printf(" The Average is %5.2f", ave);
        System.out.println("\n");
        System.out.println("The double/decimal valued average of the dataPoints array is: " +String.format("%5.2f", getAverage(dataPoints)) + ".");
        System.out.println("\n");
        Scanner in = new Scanner(System.in);

        int favNum = 0;
        boolean found = false;
        boolean done = false;

        favNum = SafeInput.getRangedInt(in, "Enter your number ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == favNum) {
                System.out.println("You number is located at " + i);
                found = true;

            }
        }
        if (!found)
            System.out.println("Value is not in the array!");


        found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == favNum) {
                System.out.println("First Found at " + i);
                found = true;
                break;

            }
        }
        if (!found)
            System.out.println("Value is not in the array!");

        // find last
        found = false;
        for (int i = dataPoints.length - 1; i >= 0; i--) {
            if (dataPoints[i] == favNum) {
                System.out.println("Last Found at " + i);
                found = true;
                break;

            }
        }
        if (!found)
            System.out.println("Value is not in the array!");


    }
    public static double getAverage(int values[])
    {
        double retVal = 0;
        double add = 0;
        double average = 0;
        Random gen = new Random();
        double[] dataPoints = new double[100];
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = gen.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++)
        {

            add += values[i];

        }

        average =  (double) add / dataPoints.length;
        retVal = average;

        return retVal;

    }
}


    

