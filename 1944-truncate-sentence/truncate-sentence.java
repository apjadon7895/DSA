class Solution {
    public String truncateSentence(String s, int k) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++){
            sb.append(word[i] +" ");
        }
        return sb.toString().trim();
        
    }
}