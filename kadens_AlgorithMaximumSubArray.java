public class kadens_AlgorithMaximumSubArray {
public  int maxSubarray(int [] nums) {
    System.out.println(" create the kadens algorithm");

    int arra[]={12,-3,7,-3,6,9};

    int currentvalue=0 ; int  Max=Integer.MIN_VALUE;
     
    for(int i=0 ;i<arra.length;i++){ 

    currentvalue=currentvalue+arra[i];

    if (currentvalue>Max) {
        
        Max=currentvalue;
    }

    if(currentvalue<0){
       
        currentvalue=0;
    }
    } 
  return Max;
}    
}



