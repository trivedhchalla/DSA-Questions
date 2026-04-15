class Solution {
    public String minWindow(String s, String t) {
      if(t.length() > s.length()){
           return "";
        }
        int[] tFreq = new int[32+26];
        int[] sFreq = new int[32+26];
        for(char c : t.toCharArray()){
            tFreq[c - 'A'] ++;
        }
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while(r < s.length()){
            sFreq[s.charAt(r) - 'A']++;
            while(isValid(sFreq, tFreq)){
                if((r - l + 1) < minLen){
                    minLen = r - l + 1;
                    start = l;
                }
                sFreq[s.charAt(l) - 'A']--;
                l++;
            }
            r++;
        }  
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    private boolean isValid(int[] sFreq, int[] tFreq) {
        for (int i = 0; i < 58; i++) {
            if (sFreq[i] < tFreq[i]) return false;
        }
        return true;
    }
}
