
//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
import java.util.Scanner;

public class b20 {
    public static void main(String[] args) {
        double i, avg, sum = 0, numbers = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 numbers:");
        for (i = 0; i < 5; i++) {
            numbers = sc.nextInt();
            sum = sum + numbers;

        }
        System.out.println("The sum is = " + sum);
        System.out.println("The average is = " + (avg = sum / 5));
    }

}
