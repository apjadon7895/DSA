import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;  
        int tcount = 0;  

        for (int dig : nums) {
            if (dig == target) {
                tcount++;
            } else if (dig < target) {
                num++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (tcount > 0) {
            ans.add(num);
            num++;
            tcount--;
        }

        return ans;
    }
}
