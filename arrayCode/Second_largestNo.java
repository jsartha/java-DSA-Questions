package arrayCode;

/**
 * Second_largestNo
 */
public class Second_largestNo {

    public static void main(String[] args) {
        System.out.println("second largest  number");
        int array[]={12,34,56,4,5,33,90};
       int temp=0;
        for(int i=0; i<array.length;i++){

            for(int j=i+1 ;j<array.length;j++){
            if (array[i]<array[j]) {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                
            }

        }
    }
    System.out.println("largest number is"+ array[1]);
 //   System.out.println("largest number is"+ array[array.length-2]);

    }
}