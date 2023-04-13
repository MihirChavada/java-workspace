import java.util.Scanner;

public class i3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int [] arr = new int[50];
        System.out.println("Enter values for the array");
        for(int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
      
        System.out.println("Enter the element and array index at which you want to add element ");
        int ele = sc.nextInt();
        int ind = sc.nextInt();
        //n = n+1;

        for(int i = n;i>ind;i--){
            arr[i] = arr[i-1];
        }
        arr[ind] = ele;
        for(int i = 0;i<n+1;i++){
            System.out.print(arr[i]+" ");

        }

        
    }
    
}
