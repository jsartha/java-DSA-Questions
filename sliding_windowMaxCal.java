public class sliding_windowMaxCal {
    public static void main(String[] args) {
     
        int calArr []={1,2,2, 556,299};

        int days=3;
        int max=0;
          int sum=0;
        for( int i=0 ; i<days; i++){
          
           sum=sum+calArr[i];
           max=sum;
        
        }
        System.out.println(max);


         for(int j=1 ;j<calArr.length-days;j++){
            sum=sum-calArr[j-1]+calArr[j+days-1];

            if (max<sum) {
                max=sum;
            int currentMax=max;
            System.out.println("the number is greater  "+ currentMax);
         }
         }

        
         } 
            
              
        
         
    }
    

