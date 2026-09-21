package arrayCode;

public class sumOrAvg {
    public static void main(String[] args) {
        
       int array[]={20,10,30,40,60};

       int sum=0;
       int avg=0;

       for(int i=0; i<array.length;i++){

        sum=sum+array[i];
        avg=(sum/5);
       }

       System.out.println(" array sum is "+sum);
       System.out.println(" Array Average is "+avg);
    }
    
}
