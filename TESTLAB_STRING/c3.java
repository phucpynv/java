import java.util.Scanner;

public class StringSum {
    public static int getSumOfIntegers(String s) {
        // Computes the sum of integer numbers in the input string s
        String[] nums = s.split("\\s+");
        int intSum = 0;
        for (String num : nums) {
            try {
                intSum += Integer.parseInt(num);
            } catch (NumberFormatException e) {
                // Ignore non-integer values
            }
        }
        return intSum;
    }

    public static double getSumOfFloats(String s) {
        // Computes the sum of floating point numbers in the input string s
        String[] nums = s.split("\\s+");
        double floatSum = 0.0;
        for (String num : nums) {
            try {
                floatSum += Double.parseDouble(num);
            } catch (NumberFormatException e) {
                // Ignore non-float values
            }
        }
        return floatSum;
    }

    public static String getSumOfStrings(String s) {
        // Computes the sum of strings in the input string s
        String[] nums = s.split("\\s+");
        StringBuilder stringSum = new StringBuilder();
        for (String num : nums) {
            if (!num.matches("-?\\d+(\\.\\d+)?")) {
                // This is not a number, so add it to the string sum
                stringSum.append(num).append(" ");
            }
        }
        return stringSum.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int intSum = getSumOfIntegers(s);
        double floatSum = getSumOfFloats(s);
        String stringSum = getSumOfStrings(s);

        System.out.printf("the sum of integer numbers: %d\n", intSum);
        System.out.printf("the sum of float numbers: %.1f\n", floatSum);
        System.out.printf("the sum of strings: \"%s\"\n", stringSum);
    }
}
