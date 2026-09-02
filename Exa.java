
public class Exa{

    public static void main(String[] args) {
        

        int a[]={12,33,232,44,55,64};


        int index=3;
        int element=900;


        int NewArr[]=new int[a.length+1];


        for(int i=0;i<index;i++){

            NewArr[i]=a[i];
        }


        NewArr[index]=element;

        for(int i=index; i<a.length; i++){
         
            
            NewArr[i+1]=a[i];

        }


        for(int no: NewArr){

            System.out.println(no);
        }


        }
}