class Solution {
    public int findLucky(int[] arr) {
        int[]count = new int[501];
        for(int num:arr){
            count[num]++;
        }
        int result = -1;
        for(int i = 1;  i<= 500; i++){
            if(count[i] ==i){
                result = i;
            }
        }
        return result;
        
    }
}