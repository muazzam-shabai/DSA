class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        for(int i=0;i<strs.length;i++){ 
            StringBuilder final_str = new StringBuilder(""); 
            for(int j=0;j<sb.length() && j< strs[i].length();j++){
                if(strs[i].charAt(j) == sb.charAt(j)){
                    final_str.append(sb.charAt(j));
                }
                else{
                    break;
                }
            }
            sb.setLength(0);
            sb.append(final_str);
        }
        return sb.toString();
    }
}