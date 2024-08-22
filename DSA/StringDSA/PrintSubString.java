//Program to print the substring of the give string

import java.util.Scanner;
class PrintSubString{
    public static void printsubStr(String str,int s,int e){
        String substr="";
        for(int i=s;i<e;i++){
            substr+=str.charAt(i);
        }
        System.out.println("Your SubString is: "+substr);
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the String:");
            String str=sc.nextLine();
            System.out.println("Enter the Starting index:");
            int start=sc.nextInt();
            System.out.println("Enter the Ending index:");
            int end=sc.nextInt();
            printsubStr(str,start,end);
        }
    }
}