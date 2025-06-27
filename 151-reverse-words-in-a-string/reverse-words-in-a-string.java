class Solution {
    public String reverseWords(String s) {
        String[] Str = s.trim().split("\\s+");
        String out ="";
        for(int i = Str.length-1; i>0; i--){
            out += Str[i] +" ";
        }
        return out+Str[0];
        
    }
}