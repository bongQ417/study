package leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author plw on 2021/4/9 4:44 PM.
 * @version 1.0
 */
public class Solution001 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> deltaMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer delta = target - nums[i];
            if (deltaMap.containsKey(delta)) {
                return new int[]{deltaMap.get(delta),i};
            } else {
                deltaMap.put(nums[i], i);
            }
        }
        return null;
    }
}
