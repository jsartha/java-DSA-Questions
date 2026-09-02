public class LinearSerchingAlgoArr {

    public static void main(String[] args) {
        

        int a[]={12,34,56,75,76,44};

        int no=75;
         
        boolean found=false;

        for(int i=0 ;i<a.length;i++){

            if (no==a[i]) {
                
                System.out.println(" no is avilable  "+ i+" index position");

                found=true;
                break;
            }
          
        }

            if (found==false) {
                
                System.out.println(" not Available");
               
            }

            

        
    }
    
}
