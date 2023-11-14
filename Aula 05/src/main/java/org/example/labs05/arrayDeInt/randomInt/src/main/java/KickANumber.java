import java.util.Random;
import java.util.Scanner;

public class KickANumber {
    public static void main(String[] args) {
        int[] array = makeArray();

        int numberEntered = getUserNumber();

        boolean found = verifyNumber(array, numberEntered);

        displayResult(found, numberEntered);
    }

    private static int[] makeArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        return array;
    }

    private static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private static boolean verifyNumber(int[] array, int numberEntered) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberEntered) {
                return true;
            }
        }
        return false;
    }

    private static void displayResult(boolean found, int numberEntered) {
        if (found) {
            System.out.println("O número foi encontrado :)");
        } else {
            System.out.println("O número não foi encontrado :(");
        }
    }
}
