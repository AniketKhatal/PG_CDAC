//I/p=hi,myname is aniket g khatal patil
//o/p=Hi,My Name Is Aniket G khatal Patil
public class FirstLetterUpper {
    public static String isUppercase(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' ||str.charAt(i)==',' && i<str.length()-1){

            }
        }
        return sb.toString();
    }
    
}
