class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;
        while(right < s.length()){
            if(freq.containsKey(s.charAt(right))){
                freq.put(s.charAt(right),freq.get(s.charAt(right)) + 1);
            }else{
                freq.put(s.charAt(right),1);
            }
            while(freq.get(s.charAt(right)) > 1){
                freq.put(s.charAt(left),freq.get(s.charAt(left)) - 1);
                left++;
            }
            maxLen = Math.max(right - left + 1, maxLen);
            right++;
        }
        return maxLen;
    }
}
