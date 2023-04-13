import java.util.Scanner;

public class b14 {
    static void linear_search(int[] arr, int n, int key){
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Element found");
            }
           
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {45,22,55,88,71,10,15,63};
        
        System.out.println("Enter the value that you want ot find in the array");
        int key = sc.nextInt();

        linear_search(arr,8,key);
        
    }
}
