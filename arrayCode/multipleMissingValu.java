package arrayCode;

public class multipleMissingValu {
    
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8};
        int n = 8;

        System.out.println("Missing numbers:");

        for (int i = 1; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
    

