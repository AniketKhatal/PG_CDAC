import java.util.Scanner;
class StringF{
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
           /*
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            String names[]=new String[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the name of the student "+(i+1)+":");
                String name=sc.next();
                names[i]=name;
//                System.out.println("Enter the age of the student "+(i+1)+":");
//                int age=sc.nextInt();
//                names[i]=name+" "+age;
            }
            for(int i=0;i<n;i++){
                System.out.println("The name of the student::"+ names[i]);
            }
            */
            System.out.println("Enter a string 1: ");
            String s=sc.nextLine();
            System.out.println("Enter a string 2: ");
            String s1=sc.nextLine();
            String s3=s+s1;
            System.out.println(s3);
            printletter(s3);
        }
    }
}