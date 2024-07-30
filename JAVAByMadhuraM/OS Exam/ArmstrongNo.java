import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = number;

        // Find the number of digits in the number
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the sum of the nth powers of each digit
        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        return result == number;
    }
}
