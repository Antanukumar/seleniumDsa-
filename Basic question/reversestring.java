
public class reversestring{


    public static void main(String[] args) {
        
        String originalStr="programming";

        String reverseStr="";

        for(int i=0;i<originalStr.length()-1;i++){

            reverseStr=originalStr.charAt(i)+reverseStr;
        }
        System.out.println(reverseStr);
    }
}