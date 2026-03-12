package arrays;

public class MaximumElement {

    static void maximum(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {0,10,0,30};
        maximum(arr);
    }
}
