public class BubbleSort {
    
public static void main(String[] args) {
    
int a[]={10, 20 , 30 , 40 , 50 , 60 ,70};


int lower=0;
int lastele=a.length-1;
int Element=60;

while(Element<=a[lower]){
int middel=(lower+lastele)/2;
if(a[middel]==Element){

System.out.println("Element found at middele"+ Element);
break;
}


if (Element<a[middel]) {

    lower=lastele+1;

    System.out.println(" Greater number"+ lower);

}

else{

    lower=lastele-1;
  System.out.println(" lower position" + lower);
}
}
}


}