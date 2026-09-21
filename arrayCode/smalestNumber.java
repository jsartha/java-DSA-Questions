package arrayCode;

public class smalestNumber {
    public static void main(String[] args) {
        
        int array[]={23,445,343,89,6};

        int no=array[0];

        for (int i=1;i<array.length;i++) {

            if(array[i]<no){
              
                no=array[i];
            }
            
        }
        System.out.println("array smallest number is "+ no);
    }
    
}
