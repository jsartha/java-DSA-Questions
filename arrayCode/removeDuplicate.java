package arrayCode;
class removeDuplicate{
    public static void main (String args []){

        int array[]={1,1,2,2,3,3,4,4,5,6};
        int j=0;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]!=j){
                j++;
            array[j]=array[i];
        }
    }
    for(int k=1;k<j;k++){
        System.out.println(k);
    }
    }

    
}