import java.util.*;

public class MajorityElementII {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        int n = nums.length;
        int threshold = n / 3;
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > threshold){
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);
        
        return result;
    }
}
