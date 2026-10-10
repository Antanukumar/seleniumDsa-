public class findMIn_max {

    public static void main(String[] args) {
        
        int num[]={3,2,1,15,33};

        if(num==null || num.length ==0){


            System.out.println("Empty");

        return ;

        }

        int  smallest=num[0];
        int largest=num[0];


         for(int i=1;i<num.length;i++){

            if(num[i]<smallest){
                smallest=num[i];
            }

            else if (num[i]>largest) {
                largest=num[i];
            }
    
   }
System.out.println(smallest);

System.out.println(largest);
    }
  


    
}
