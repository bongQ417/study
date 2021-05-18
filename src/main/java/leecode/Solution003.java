package leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author plw on 2021/5/12 9:08 AM.
 * @version 1.0
 */
public class Solution003 {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> positionMap = new HashMap<Character, Integer>();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (positionMap.containsKey(c)) {
                start = Math.max(start, positionMap.get(c) + 1);
            }
            positionMap.put(c, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
