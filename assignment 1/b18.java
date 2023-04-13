//Write a Java program that takes a year from user and print whether that year is a leap year or not. 
import java.util.Scanner;
public class b18 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any year to know whether its a leap year or not");
        int year = sca.nextInt();
        if(year%4 == 0){
            System.out.println("It is a leap year");

        }
        else{
            System.out.println("It is not a leap year");
        }



    }
    
}
