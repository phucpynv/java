import java.util.Scanner;

public class Main {
    public static boolean isValidString(String s) {
        /*
         * Checks whether the input string is a valid string or not. Returns true if
         * the input string is valid, false otherwise.
         */
        String[] nums = s.split("\\s+");
        for (String num : nums) {
            if (!num.replace(".", "").matches("\\d+")) {
                return false;
            }
        }
        return true;
    }

    public static double squareSumOfNumerals(String s) {
        /*
         * Computes the square sum of numerals in the input string. Returns the square
         * sum if the input string is valid, "N/A" otherwise.
         */
        if (!isValidString(s)) {
            return Double.NaN;
        }
        String[] nums = s.split("\\s+");
        double sum = 0;
        for (String num : nums) {
            double x = Double.parseDouble(num);
            sum += x * x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string that has numerals: ");
        String s = input.nextLine();
        double result = squareSumOfNumerals(s);
        if (Double.isNaN(result)) {
            System.out.println("invalid string\tN/A");
        } else {
            System.out.printf("valid string\tsquare sum: %.1f\n", result);
        }
        input.close();
    }
}