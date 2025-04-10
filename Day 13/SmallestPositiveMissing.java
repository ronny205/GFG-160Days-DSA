class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        boolean hasOne = false;
        
        for( int num : arr){
            if( num == 1){
                hasOne = true;
                break;
            }
        }
        
        if( !hasOne) return 1;
        
        for ( int i = 0; i < n; i++){
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = 1;
            }
        }
        
        for ( int i = 0; i < n; i++){
            int index = Math.abs(arr[i]) - 1;
            arr[index] = -Math.abs(arr[index]);
        }
        
        for( int i = 0; i < n; i++){
            if( arr[i] > 0){
                return i + 1;
            }
        }
        
        return n + 1;
    }
}
