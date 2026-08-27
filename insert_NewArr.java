class insert_NewArr{

    public static void main(String[] args) {
        
        System.out.println(" in this program create for insert index position array");


      int a[]={12,34,56,778};
      
      int index=2;
      int element=120;
//1
      int newArray[]=new int[a.length+1];
// 2
      for(int i=0; i<index;i++){

        newArray[i]=a[i];
      }


             newArray[index]=element;

             for(int i=index; i<a.length ;i++){

                newArray[i+1]=a[i];
             }
      // Iterative  Process


      for(int no : newArray){

        System.out.print(no + " ");
      }
      

    }

}