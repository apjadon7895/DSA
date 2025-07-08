class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i = 0; i<s.length()-1; i++){
            for(int j=s.length()-1; j>0; j--){
                if(s.charAt(i)==s.charAt(j) && s.charAt(i+1)==s.charAt(j-1)){
                    return true;
                }
            }
        }
        return false;
        
    }
}