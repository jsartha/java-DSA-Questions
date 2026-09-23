package arrayCode;

public class copyarray {
    public static void main(String[] args) {
        
    
    int array[]={1,2,3,4,56,78,99};
    int copyarray[]=new int[array.length];
    
     for(int i=0;i<array.length;i++){

        copyarray[i]=array[i];

     }

     for(int i=0; i<copyarray.length;i++ ){
        System.out.println(copyarray[i]);
     }
}
}