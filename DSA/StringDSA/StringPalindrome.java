//Program to check the String is palindrome or not

import java.util.Scanner;
class StringPalindrome{
public static boolean isPalindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i) != str.charAt(n-1-i)) {
            return false;
        }
    }
    return true;
}
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String:");
            if (isPalindrome(sc.nextLine().toUpperCase())) {
                System.out.println("The String is palindrome");
            } else {
                System.out.println("The String is not palindrome");
            }
        }
    }
}