import java.util.Scanner;

public class b17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello and welcome to Tops";
        System.out.println("The provided string is :"+str);
        System.out.println("Enter index of which you want to find character at");
        int ind = sc.nextInt();
        System.out.println("The character at position "+ind+" is "+str.charAt(ind));

        
    }
    
}
