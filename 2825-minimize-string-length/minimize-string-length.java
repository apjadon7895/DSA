class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> uchar= new HashSet<>();
        for(char c:s.toCharArray()){
            uchar.add(c);
        }   
        return uchar.size();     
    }
}