public class a3 {
    public static void main(String[] args) {
        int  [] arr = {21,10,55,32,4,-7,8,10,10};

        System.out.println("The array you entered is :");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        int search =10;
        int find =30;
        System.out.println("\nResult is "+result(arr,search,find)); 
    }
    public static boolean result(int []array,int search,int find){
        int temp =0;
        for (int number : array) {
            if (number == search) {
              temp+= search;
            }
      
            if (temp > find) {
              break;
            }
          
          
        }  
        return temp == find;

    }    
}
