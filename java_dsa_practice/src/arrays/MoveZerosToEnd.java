package arrays;

public class MoveZerosToEnd {

    static void moveZeros(int arr[]){
        int j = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int a : arr)
            System.out.print(a + " ");
    }

    public static void main(String[] args) {
        int arr[] = {0,10,0,30};
        moveZeros(arr);
    }
}
