package arrayCode;

public  class linearSearchArr  {

    public static void main(String[] args) {
        
        int arr[]={23,90,56,48};
         
        int value=90;

         for( int i=0 ; i<arr.length; i++){

            if (arr[i]==value) {
                System.out.println(" the find out index position is element  "+i);
                
            }
         }
    }
    
}
