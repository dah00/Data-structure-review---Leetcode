import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.keySet()
    }

    static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.remove(nums[i]);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        throw new NoSuchElementException();
    }
}
