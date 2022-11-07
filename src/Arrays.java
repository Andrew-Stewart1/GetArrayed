public class Arrays {
    public static void main(String[] args) {
        //Declare an array

        int index = 0;

        String[] names = new String[5];
        System.out.println("The value at index " + index + " is: " + names[index]);


        String[] namesOfPets = new String[1];
        names = new String[]{"Andrew", "Ryan", "Stewart", "Joel"};
        System.out.println("The value at index " + index + " is: " + names[index]);
        System.out.println("The length of the array is " + names.length);


        //Print out all the names in the array
        int element;
        for (element = 0; element < names.length; element++) {
            System.out.printf("Index: %5d Name: %10s %n", element, names[element]);
        }

        index = 3;
        int[] grades;
        grades = new int[10];
        for (int e = 0; e < grades.length; e++) {
            grades[e] = e * e;
        }
        index = 5;
        System.out.println("The value at index" + index + " is: " + grades[index]);

        for(int i =0; i < grades.length; i++){
            System.out.printf("Index: %d Value: %d %n", i, grades[i]);
        }
    }
}
