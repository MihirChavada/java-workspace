public class a5 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        System.out.println("The array without rotating is :");

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println("\nThe array after cyclically rotating is :");
        int last = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0] =last;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }
    
}

