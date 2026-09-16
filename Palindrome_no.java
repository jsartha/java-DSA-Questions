public class Palindrome_no {
    public static void main(String[] args) {
        
    
    System.out.println(" created the palindrome number");


    int no= 121;
    int temp=no;

    int rev =0, rem;
   
    while (temp !=0) {
        
         rem= temp%10;    
         rev=rev*10+rem;
         temp=temp/10;
    }    
    if (no==rev) {
        System.out.println(" it is palindrome number");
        
    }
    }

    
}
