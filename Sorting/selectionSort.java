package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        

        int arra[]={14,30,10,20,12,6,9};

        for( int i=0; i<arra.length;i++){
              int poit=i;
            for(int j=i+1; j<arra.length;j++){
                 
                if(arra[poit]>arra[j]){
                 poit=j;
                }
            }

            int temp=arra[poit];
            arra[poit]=arra[i];
            arra[i]=temp;
        

        }

        for( int no :arra){
            System.out.print( no+ " ");
        }
    }
    
}
