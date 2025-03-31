
public class ReverseArray {
    public void reverseArray(int arr[]) {
        
        int n = arr.length;
        int count = n - 1;
        
        for ( int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count--;
        }
    }
}