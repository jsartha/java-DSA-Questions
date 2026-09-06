package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        
        int a[]={55,32,44,30,35,67,10};

        int leg=a.length;
        int temp;
        Boolean Support=false;

        for(int i=0; i<leg; i++){

            for(int j=0 ; j<leg-1; j++){
               
                if(a[j]>a[j+1]){
                  
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    Support=true;
                }

            }
            if(!Support){
             break;
            }
        }

        for(int no : a){
            System.out.println(no);
        }
    }
}


