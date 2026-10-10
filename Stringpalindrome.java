import java.util.Set;

public class Stringpalindrome {
    

    static  boolean ispalindrome(String s){

    int  left=0;

     int   right=s.length()-1;

     while (left<right) {

        if(s.charAt(left)!=s.charAt(right)){

            return  false;




        }
        return  true;
        
     }
     return false;

        


    }

    public static void main(String[] args) {
        
        String s="abbc";
        System.out.println(ispalindrome(s));
    }
}
