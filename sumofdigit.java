public class sumofdigit {

    public static void main(String[] args) {
        
        int n=12345;

        int sum =0;

        int temp=Math.abs(n);

        while (temp>0) {
            

            sum +=temp%10;

            temp /=10;

        }
        System.out.println(sum);
    }
    
}
