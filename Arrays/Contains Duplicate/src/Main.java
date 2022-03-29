import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] nums = {1,2,3,5,1};

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                return true;
        }
        return false;

    }
}
