//Program to do 1st letter in upper case

import java.util.Scanner;
public class FirstLetterUpperCase {
    public static String toUppeCase(String str){
        StringBuilder sb=new StringBuilder("");

        //for 1st letter of the string
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        //for remamining of the string
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a string:");
            System.out.println(toUppeCase(sc.nextLine()));

        }
    }
}