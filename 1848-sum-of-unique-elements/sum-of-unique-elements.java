class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int num:nums){
            int count = 0;
            for(int n:nums){
                if(n==num){
                    count++;
                }
            }
            if(count ==1){
                sum +=num;
            }
        }
        return sum;
        
    }
}