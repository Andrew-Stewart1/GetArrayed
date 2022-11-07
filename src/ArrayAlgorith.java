import java.util.Random;

public class ArrayAlgorith {
    public static void main(String[] args) {
        int[] grades = new int[100];
        System.out.println("Index 55 is: " + grades[55]);
        grades[55] = 90;
        System.out.println("Index 55 is: " + grades[55]);

        Random random = new Random();

        for(int i = 0; i < grades.length; i++){
            grades[i] = random.nextInt(100) + 1;
        }
        for(int i = 0; i < grades.length; i++){
            System.out.printf(" %d", grades[i]);
            if (i % 20 == 0){
                System.out.println("");
            }
        }

        //fine the maximum element in the array
        int maxNumber = 0;
        int maxNumberIndex = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] >= maxNumber){
                maxNumber = grades[i];
                maxNumberIndex = i;
            }
        }
        System.out.println("The maximum number in the loop is: " + maxNumber);
        System.out.println("The index of the maximum number is: " + maxNumberIndex);

        int minNumber = 0;
        int minNumberIndex = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < minNumber){
                minNumber = grades[i];
                minNumberIndex = i;

            }
        }
        System.out.println("The minimum number in the array is: " + minNumber);
        System.out.println("The index of the minimum number in the array is: " + minNumberIndex);


        int sum = 0;
        int average = 0;
        for(int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }
        average = sum / grades.length;
        System.out.println("The total sum of the grades is: " + sum);
        System.out.println("The average of the grade is: " + average);



        //Searching for a value in the array

        int searchnumber = 0;
        System.out.println("Searching for " + searchnumber + "...");

    }
}
