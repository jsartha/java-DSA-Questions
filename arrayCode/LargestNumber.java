package arrayCode;

public class LargestNumber {
    public static void main(String[] args) {
        
      System.out.println(" largest array code");
        int array[]={23,45,65,366,900};
         int no=array[0];
        for(int i=0;i<array.length;i++){
            
            if(array[i]>no){
                  no=array[i];
              
            }
        }
          System.out.println("It is greater number"+no);
    }
    

}