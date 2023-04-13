import java.util.Arrays;

//W.A.J.P to compute the average value of an array of integers except the largest and smallest values.

public class a2 {
    public static void main(String[] args) {
        double [] arr = {12,34,55,60,8,17,21};
        double sum = 0;
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        for(int i = 1;i<(arr.length-1);i++){
            sum +=arr[i];
        } 
        double average = sum/(arr.length-2);
        System.out.println("\nThe average of required array is ="+average);
        

    }
    
}
