class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        HashMap<Character,Integer> sfreq = new HashMap();
        HashMap<Character,Integer> tfreq = new HashMap();
        for(int i = 0;i < s.length(); i++){
            sfreq.put(s.charAt(i),sfreq.getOrDefault(s.charAt(i),0) + 1);
            tfreq.put(t.charAt(i),tfreq.getOrDefault(t.charAt(i),0) + 1);
        }
        if(sfreq.equals(tfreq)){return true;}
        return false;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // brute force
        int[] visited = new int[strs.length];
        Arrays.sort(strs);
        List<List<String>> res = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            List<String> ansSameSize = new ArrayList<>(); 
            if(visited[i] == 1){continue;}
            for(int j = i + 1; j < strs.length; j++){

                if(visited[j] == 0 && 
                strs[i].length() == strs[j].length() && 
                this.isAnagram(strs[i],strs[j]))
                {
                        ansSameSize.add(strs[j]);
                        visited[j] = 1;
                }
            }

            if(visited[i] == 0){
                ansSameSize.add(strs[i]);
            }
            visited[i] = 1;
            res.add(ansSameSize);
        }
    return res;
    }
}
