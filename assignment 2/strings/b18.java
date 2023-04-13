import java.util.Scanner;

public class b18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        System.out.println("The concatenated string is ");
        System.out.println(str1+" "+str2);

        String s1 = "topsint.com";
        String s2 = "Topsint.com";
        System.out.println("Comparing "+s1+" and "+s2+" we get "+s1.equals(s2));
    }
    
}
