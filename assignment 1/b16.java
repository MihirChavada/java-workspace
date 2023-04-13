//W.A.J.P to Take three numbers from the user and print the greatest number. 

import java.util.Scanner;

public class b16 {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter three numbers of your choice");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();   
        
        if(a>b && a>c){
            System.out.println("The greatest number is :"+a);

        }
        else if(b>c){
                System.out.println("The greatest number is :"+b);
        }
        
        else{
                System.out.println("The greatest number is :"+c);
        }


    }

}