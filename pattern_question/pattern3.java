package pattern_question;

public class pattern3 {
    public static void main(String[] args) {
        int n=5;


        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print("_");
            }
            for(int k=1;k<=i;k++){
            
            System.out.print("*");

        }
        System.out.println();
        
    }
    }
    
}
