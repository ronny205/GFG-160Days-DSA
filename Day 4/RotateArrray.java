class RotateArray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        d = d % n; // Handle cases where d > n
        
        reverse (arr, 0, d - 1); // reverse first  elements
        
        reverse (arr, d, n - 1); // reverse next n-d elements
        
        reverse (arr, 0, n - 1); // reverse entire array
    }
    
    // reverse the array
    static void reverse(int[] arr, int start, int end){
        while ( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}