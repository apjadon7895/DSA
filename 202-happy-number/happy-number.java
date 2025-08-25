class Solution {
    public boolean isHappy(int n) {
        while(n !=1 && n!=4){
            int store = 0;
            while(n>0){
                int digit = n%10;
                store+=digit*digit;
                n/=10;
            }
            n = store;
        }
        return n==1;
        
    }
}