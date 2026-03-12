package arrays;

public class CheckSortedArray {

    static void checkSorted(int arr[]) {

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("Not Sorted");
                return;
            }
        }

        System.out.println("Sorted");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        checkSorted(arr);
    }
}