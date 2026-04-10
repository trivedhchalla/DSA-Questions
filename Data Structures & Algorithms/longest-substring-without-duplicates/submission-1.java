class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxWin = 0;
        if(s.length() == 1) return 1;
        for(int i = 0; i < s.length() - 1; i++){
            Set<Character> st = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                char temp = s.charAt(j);
                if(st.contains(temp)){
                    break;
                }
                st.add(temp);
                maxWin = Math.max(maxWin,(j - i) +1);
            }
        }
        return maxWin;
    }
}
