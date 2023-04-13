import java.util.Arrays;

public class b11 {
    public static void main(String[] args) {
        int[] arr = { 55, 10, 14, 85, 7, 63, 71, 10 };

        System.out.println("The unsorted array is ");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is :");
        for (int i = 0; i < 8; i++) {
            System.out.print(+arr[i] + " ");
        }

        String[] arr2 = { "Yashpal", "Yogiraj", "Raj", "Java", "Python" };
        System.out.println("\nThe unsorted string is :");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
        Arrays.sort(arr2);
        System.out.println("\nThe sorted string is ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");

        }
    }
}