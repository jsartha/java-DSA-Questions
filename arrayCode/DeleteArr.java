package arrayCode;
public class DeleteArr {
    
    public static void main(String[] args) {
        

        int a[]={15,20 ,30,78 ,44};

        int NewArr[]=new int [a.length-1];
         
        int index=0;
        int j=0;

        for(int i=0 ; i<=a.length;i++){
           
            if(j==index){       // if(element!=index)
                                         //{  }
                continue;
            }

            NewArr[j]=a[i];
               j++;
        }

        for( int no : NewArr){

            System.out.println(no + " ");
        }
    }
}
