class Solution {
    public String removeDuplicates(String s) {
        StringBuilder st = new StringBuilder();
        for(char ch :s.toCharArray()){
            int len= st.length();
            if(len>0 && st.charAt(len-1)==ch){
                st.deleteCharAt(len-1);
            }else{
                st.append(ch);
            }
        }
        return st.toString();
        
    }
}