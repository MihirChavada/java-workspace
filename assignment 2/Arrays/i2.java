import java.util.Arrays;

public class i2 {
    public static void main(String[] args) {
        int [] arr = {10,12,71,20,35};
        int [] arr2 = new int[5];

        for(int i = 0;i<5;i++){
            arr2[i] = arr[i];
        }

        System.out.println("The copied array is :"+Arrays.toString(arr2));
    }
    
}
