public class rangeprime {

    public static void main(String[] args) {
        for(int n=10;n<=30;n++){
            boolean isPrime=true;

            for(int i=2;i<n;i++){

                if (n%i==0) {
                    isPrime=false;
                    break;
                    
                }
            }
            if (isPrime) {
                System.out.println(n);
            }

        }
    }
    
}
