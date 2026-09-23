package arrayCode;

public class misssingNumber {
    public static void main(String args []){
        
        int array[]={1,2,3,5,6,7};
        int no=7;
        int ActualSum=0;
        int ExpectedSum=(no*(no+1)/2);
        for(int i=0 ; i<array.length;i++){
        ActualSum=ActualSum+array[i];
    
        }
        int minValue=ExpectedSum-ActualSum;
        System.out.println(minValue);

    }
    
}
