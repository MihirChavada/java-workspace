import java.util.Scanner;

public class b12_b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] arr = new int[50];
        System.out.println("Enter 5 values for array");
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<5;i++){
            sum += arr[i];

        }
        System.out.println("The sum of array is = "+sum);
        //For question b13:

        System.out.println("The average of the array elements is = "+(sum/5));

    }
    
}
