//Basic String builder program

public class StringbuilderEx{
    public static void main(String agrs[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}