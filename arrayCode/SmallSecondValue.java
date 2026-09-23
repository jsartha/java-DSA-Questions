package arrayCode;

public class SmallSecondValue {
    
    public static void main(String[] args) {
        System.out.println(" second largest number");

       int  array[]={1,2,3,4,5,6,7,8,9,10};
         int temp;
         
       for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
         
            if(array[i]>array[j]){
              
                temp=array[i];
                array[i]=array[j];
                temp=array[i];
                

            }
        }
       }
       System.out.println("smallest number is"+array[1]);

    }
}
