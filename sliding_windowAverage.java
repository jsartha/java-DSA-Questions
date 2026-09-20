public class sliding_windowAverage {

    public static void main(String[] args) {
        
    
    int userdata[]={12,34,24,22,11,33,22};

    int sum=0;
    int avg=0;
    int days=4;

    for(int i=0;i<days;i++){

       sum=sum+userdata[i];
       avg=sum/days;

    }
    System.out.println(" first 3 days (Average) and (sum)"+ avg+" "+ sum);

    for(int j=1;j<userdata.length-days;j++){

        sum=sum-userdata[j-1]+userdata[j+days-1];

        avg=sum/days;
        System.out.println(" last Days Average and sum "+ sum + " "+ avg);

    }
    
}
}