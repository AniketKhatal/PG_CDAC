//Program to find the shortest path from given Direction string

import java.util.Scanner;
class FindTheShortestString{
    public static float getShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            //South
            if(str.charAt(i)=='S'){
                y--;
             //North
            }else if(str.charAt(i)=='N'){
                y++;
             //East
            }else if(str.charAt(i)=='E'){
                x++;
             //west
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);   //type cast because math.sqrt returns in double n thats why we cast into the float

    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Direction String:");
            System.out.println("The shotest Path is:"+getShortestPath(sc.nextLine().toUpperCase()));
        }
    }
}