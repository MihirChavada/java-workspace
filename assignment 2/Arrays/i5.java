import java.util.Arrays;

public class i5 {
    public static void main(String[] args) {
        int [] arr = {42,12,25,65,53,25,66,12};

        //Arrays.sort(arr);
        //int i =0,j=7;
        //System.out.println("The common elements are:");
        for(int i = 0;i<7;i++){
            for(int j = i+1;j<7;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Common elements are :"+arr[j]);

                }

            }

        }
        
    }
    
}
