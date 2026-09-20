public class sliding_window{
    public static void main (String args []){



        System.out.println(" Sliding window program created ");

       int arra[]={1,2,3,4,5,6,7};
       int days=3;
      int sumWindow=0;
      for( int i=0 ;i<3 ;i++){

       sumWindow=sumWindow+arra[i];
      }
      System.out.println(sumWindow);

      for(int i=1;i<arra.length-days; i++){
           sumWindow=sumWindow-arra[i-1]+arra[i+days-1];
           
           System.out.println("last three days visited people data "+ sumWindow);
      }
    
    
    }
}