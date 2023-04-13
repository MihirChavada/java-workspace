//sort 0's and 1's on one side of array


public class a4 {

    static void sliding_zeros(int [] arr, int m){
        int i = 0,j=0;
        for(i = 0;i<m;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //swap(arr[i],arr[j]);
                j++;
            }

        }

    }

    static void printarr(int [] arr,int n){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,1,0,0,1};

        System.out.println("The array without swapping:");
        printarr(arr,arr.length);
        System.out.println("\nThe array after sliding array is ");
        sliding_zeros(arr,arr.length);
        printarr(arr,arr.length);
    }
    
}
