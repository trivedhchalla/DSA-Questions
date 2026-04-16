class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
           return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int count = 0;
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) > 0){
                    count++;
                }
                map.put(s.charAt(r), map.get(s.charAt(r)) - 1);
            }else{
                map.put(s.charAt(r), -1);
            }
            while(count == t.length()){
                if((r - l + 1) < minLen){
                    minLen = r - l + 1;
                    start = l;
                }
                map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                if(map.get(s.charAt(l)) > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}