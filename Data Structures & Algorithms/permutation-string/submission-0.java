class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = 0;
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> freq1 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            freq.put(s1.charAt(i), freq.getOrDefault(s1.charAt(i),0) + 1);
            freq1.put(s2.charAt(i), freq1.getOrDefault(s2.charAt(i),0) + 1);
            r++;
        }
        while(r < s2.length()){
            if(freq.equals(freq1)){
                return true;
            }
            
            freq1.put(s2.charAt(l),freq1.get(s2.charAt(l)) - 1);
            if(freq1.getOrDefault(s2.charAt(l), 0) == 0){
                freq1.remove(s2.charAt(l));
            }
            l++;
            if(r < s2.length()) freq1.put(s2.charAt(r),freq1.getOrDefault(s2.charAt(r), 0) + 1);
            r++;
        }
        if(freq.equals(freq1)){
            return true;
        }
        return false;
    }
}
