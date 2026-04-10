class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        HashMap<Character,Integer> sfreq = new HashMap();
        HashMap<Character,Integer> tfreq = new HashMap();
        for(int i = 0;i < s.length(); i++){
            sfreq.put(s.charAt(i),sfreq.getOrDefault(s.charAt(i),0) + 1);
            tfreq.put(t.charAt(i),tfreq.getOrDefault(t.charAt(i),0) + 1);
        }
        // for(int i = 0;i < s.length();i++){
        //     if(sfreq.get(s.charAt(i)) != tfreq.get(s.charAt(i))){
        //         return false;
        //     }
        // }
        if(sfreq.equals(tfreq)){return true;}
        return false;
    }
}
