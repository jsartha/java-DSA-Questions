
public class Exa{
 public static void main(String[] args ){

 System.out.println("create the window sliding code");
      
 int data[]={1,2,3,4,5,6,7,8};

 int days=4;
 int sum=0;
 for( int i=0 ;i<days ;i++){
 
sum=sum+data[i];

 }
 System.out.println(sum);

    for(int j=1 ;j<data.length-days;j++){
     
        sum=sum-data[j-1]+data[j+days-1];
        System.out.println("last wisited user"+ sum);


    }
    //System.out.println("last wisited user"+ sum);

 }

        }
