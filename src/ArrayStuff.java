import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {
        int amount = 100;
        int usersValue = 0 ;
        int total = 0;
        int[] dataPoints = new int[amount];
        int min = dataPoints[0];
        int max = dataPoints[0];
        dataPoints = new int[amount];
        Random numbers = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < amount; i++) {
            dataPoints[i] = 1 + numbers.nextInt(100);
        }
        for (int i = 0; i < amount; i++) {
            int ActivePoint = dataPoints[i];
            System.out.print(ActivePoint);
            if (i < amount - 1) {
                System.out.print("|");
            }
            for (int j = 0; j < amount; j++) {
                total = total + dataPoints[j];
            }
        }
            double average = total / amount;

            System.out.println("\nThe sum of the array is: " + total);
            System.out.println("The average of the array is: " + average);

        usersValue = SafeInputs.getRangedInt(in, "Please enter a number 1 to 100", 1,100);
        int sameValue = 0;
        for (int i : dataPoints) {
            if (i == usersValue) {
                sameValue++;
            }
        }
            System.out.println("Your value " + usersValue + " was matched " + sameValue + " times in the array");

            do {
                System.out.println("Please choose a number from 1 to 100");
                usersValue = in.nextInt();
                if (usersValue >= 1 || usersValue <= 100) {
                    break;
                }
                System.out.println("Not a valid number. Please try again");
            } while (true);
            int matches1 = -1;
            for (int i = 0; i < amount; i++) {
                if (dataPoints[i] == usersValue) {
                    matches1 = i;
                    break;
                }
            }
            if (matches1 == -1) {
                System.out.println("Your value " + usersValue + "was not found in the array");
            } else {
                System.out.println("Your value " + usersValue + " was found in the array " + matches1);
            }
            for (int i = 1; i < amount; i++){
                int data = dataPoints[i];
                if (data > max)
                    max = data;
                if (data < min)
                    min = data;
            }

            System.out.println("The minimum value is: " + min);
            System.out.println("The maximum value is: " + max);
    }
    public static double getDoubleAverage(double[] numbers) {
        double total = 0;
        double avg = 0;
        if (numbers != null && numbers.length != 0) {
            for (double d : numbers) {
                total = total + d;
            }
            avg = total / numbers.length;
        }
        return avg;
    }
}
