public class MaxCircularSubArraySum {
    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int n = arr.length;
        
        // find max subArray using normal kadane's algorithm
        int maxNormal = findMaxSubArraySum(arr);
        
        //calculating total array sum and invert array elements
        int total = 0;
        for (int i = 0; i < n; i++){
            total += arr[i];
            arr[i] = -arr[i];
        }
        
        //finding min subArray sum on inverted array
        int maxInverted = findMaxSubArraySum(arr);
        int maxCircular = total + maxInverted;
        
        if (maxCircular == 0) return maxNormal;
        
        return Math.max(maxNormal, maxCircular);
     }
     
     public int findMaxSubArraySum(int[] arr){
         int currentSum = arr[0];
         int maxSum = arr[0];
         int n = arr.length;
         
         for (int i = 1; i < n; i++){
             currentSum = Math.max(arr[i], currentSum +arr[i]);
             maxSum = Math.max(maxSum, currentSum);
         }
         
         return maxSum;
         
     }
}