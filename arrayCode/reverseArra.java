package arrayCode;

public class reverseArra {
    public static void main(String[] args) {
        
       int array[]={1,2,3,4,5,67,7,8,9};
        
       int start=0;
       int end=array.length-1;
       int Temp;
       while (start<end) {

         Temp=array[start];
        array[start]=array[end];
        array[end]=Temp;
        start++;
        end--;
       }
       System.out.println(" Reverse array");

       for(int no:array){
        System.out.print( no);
       }
    }
    
}
