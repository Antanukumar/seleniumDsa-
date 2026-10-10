public class factorial {

    static  int isfactorial(int n){

       if (n==0 || n==1){

            return  1;

          

       }
         return  n*isfactorial(n-1);

       
       }
       public static void main(String[] args) {
        int n=5;
        

        System.out.println(isfactorial(n));

    

    }
    
}
