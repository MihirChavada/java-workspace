import java.util.Scanner;

public class i1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter another string to check the ending for first string");

        String s2 = sc.nextLine();
        int start = s1.length();
        int ending = s2.length();


        String sstring = s1.substring(start-ending,start);

        if(sstring.equals(s2)==true){
            System.out.println("The string  "+s1+" ends with contents of "+s2);
        }
        else
        System.out.println("The string "+s1+" doesnot end with contents of "+s2);



        
        

    }
    
}
