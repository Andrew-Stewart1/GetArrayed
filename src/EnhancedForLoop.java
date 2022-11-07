import java.util.Random;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] age = new int[30];

        Random random = new Random();

        for (int i = 0; i < age.length; i++) {
            age[i] = random.nextInt(7) + 18;
        }
        for (int i = 0; i < age.length; i++) {
            System.out.printf("%5d", age[i]);
        }
        for (int e: age){
            System.out.printf("%5d", e);
        }
        String[] names = {"John", "Jill", "Jack", "Mary"};

        for (String name: names){
            System.out.printf("%5d", name);
        }
    }
}