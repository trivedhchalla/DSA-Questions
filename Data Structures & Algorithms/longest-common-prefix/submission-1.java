class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        for(int i = 0; i < strs.length; i++){
            if(minStr.length() > strs[i].length()){
                minStr = strs[i];
            }
        }
        for(int i = 0; i < minStr.length(); i++){
            char ch = minStr.charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(ch != strs[j].charAt(i)){
                    return minStr.substring(0,i);
                }
            }
        }
        return minStr;
    }
}