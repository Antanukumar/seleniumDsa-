public class delationArray {

    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        int indexpass=1;

        int j=0;

        int []newarr=new int[arr.length-1];

        for(int i=0;i<arr.length;i++){


            if (i==indexpass) {
                continue;
            }

            newarr[j]=arr[i];
            j++;
        }
        for(int no:newarr){
            System.out.println(no);
        }
    }
    
}
