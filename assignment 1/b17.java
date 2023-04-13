/*Write a Java program that takes the user to provide a single character from the alphabet. Print 
Vowel or Consonant, depending on the user input. If the user input is not a letter (between an and z or 
A and Z), or is a string of length > 1, print an error message. */
import java.util.Scanner;
public class b17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.println("Enter the character of your choice");
        a = sc.next().charAt(0); 
        int m = a;

        if(m==97 || m==101 || m==105 || m==111 || m==117){
            System.out.println("Your input is a vowel");

        }
        else if(m>= 97 && m<= 122 || m>= 65 && m<= 90 ){
            System.out.println("Your input is a consonant");

        }
        else
        System.out.println("You have entered a wrong value :(");




    }
    
}
