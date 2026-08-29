class insert_NewArr{

    public static void main(String[] args) {
        
        System.out.println(" in this program create for insert index position array");


         int a[]={1,2,3,45,6,7};

         int index=3;

         int no=900;

         // Length
         int newArr[]=new int [a.length+1];

         // Copy
         for(int i=0; i<index ;i++){

           newArr[i]=a[i];

         }
 
           
           newArr[index]=no;
          
           for(int i=index; i<a.length; i++){

             newArr[i+1]=a[i];

           }


         for( int n:newArr){

          System.out.print(n+ " ");
         }


    }
  }