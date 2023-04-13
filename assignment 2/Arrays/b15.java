import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {45,22,55,88,71,10,15,63};
        
        System.out.println("Enter the value of which you want to find index in the array");
        int key = sc.nextInt();

        for(int i = 0;i<8;i++){
            if(arr[i]==key){
                System.out.println("The index of the key value is = "+i);

            }

        }

    }
    
}
