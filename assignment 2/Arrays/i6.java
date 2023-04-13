import java.util.Arrays;

public class i6 {
    public static void main(String[] args) {
        String [] arr = {"YASHPAL","YOGIRAJ","MIHIR","YASHPAL","VEDANT","RAJ","RAJ"};

        //Arrays.sort(arr);
        //int i =0,j=7;
        //System.out.println("The common elements are:");
        for(int i = 0;i<6;i++){
            for(int j = i+1;j<6;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Common elements are :"+arr[j]);

                }

            }

        }
        
    }
    
}
