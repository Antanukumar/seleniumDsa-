

public  class leap{

    public static void main(String[] args) {
        


        int n=2026;

        if(n%4==0){
            System.out.println("leap");
        }else if (n%100==0) {

            System.out.println("not");
            
        }else if (n%400==0) {
            System.out.println("leap");
            
        }
    }
}