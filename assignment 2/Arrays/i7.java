import java.util.Arrays;

//wajp to find second largest element in an array
public class i7 {
    public static void main(String[] args) {
        //int [] arr = {12,35,40,71,71,7,6};
        int [] arr = {71,71,71,71,71,71};
        Arrays.sort(arr);

        for(int i = (arr.length-2);i>=0;i--){
            if(arr[i] != arr[(arr.length)-1]){
                System.out.println("The second largest element is = "+arr[i]);
                break;

            }
        }
        System.out.println("There is no second largest element");

        
    }
    
}
