//input= aaaabbcz
//output=a4b2cz

import java.util.Scanner;
public class StringCompression{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string: ");
            System.out.println("The new Str is:"+compress(sc.nextLine()));
        }
    }
}