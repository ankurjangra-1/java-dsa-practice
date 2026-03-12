package arrays;

public class KadaneAlgorithm {

    static void kadane(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];

            if(sum > maxSum)
                maxSum = sum;

            if(sum < 0)
                sum = 0;
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {0,10,0,30};
        kadane(arr);
    }
}
