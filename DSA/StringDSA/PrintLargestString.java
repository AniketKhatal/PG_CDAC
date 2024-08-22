//Program to print the largest String with repsect to the lexical Analysis

import java.util.Scanner;

class PrintLargestString {
    public static String largestString(String[] s) {
        String largest = s[0];
        for (int i = 1; i < s.length; i++) {
            if (largest.compareTo(s[i]) < 0) {
                largest = s[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            sc.nextLine();  // consume the leftover newline

            String[] names = new String[size];
            System.out.println("Enter the names into the array:");
            for (int i = 0; i < names.length; i++) {
                names[i] = sc.nextLine();
            }

            System.out.println("The maximum string is: " + largestString(names));
        }
    }
}
