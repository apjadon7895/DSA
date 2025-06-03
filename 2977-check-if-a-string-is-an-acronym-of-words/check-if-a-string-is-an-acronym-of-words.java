class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length())return false;
        int count =0;
        for(int i =0; i < s.length(); i++){
            String t = words.get(i);
            if(s.charAt(i)==t.charAt(0)){
                count++;
            }
            if (count == s.length()) return true;
        }
        return false;
        
    }
}