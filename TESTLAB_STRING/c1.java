import java.util.Scanner;

public class BinaryAndNumberToString {
    // Array to hold the English word representations of numbers
    private static final String[] numberNames = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static void printBinary(int n) {
        // Print the binary representation of n
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
    }

    public static void printNumberInWords(int n) {
        // Print the English word representation of n
        String numStr = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result.append(numberNames[digit]);
            if (i < numStr.length() - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        printBinary(n);
        printNumberInWords(n);
    }
}