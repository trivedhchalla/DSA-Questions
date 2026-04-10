class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] k = strs[i].toCharArray();
            Arrays.sort(k);
            String key = new String(k);
            if(res.containsKey(key)){
                List<String> pre = res.get(key);
                pre.add(strs[i]);
                res.put(key,pre);
            }else{
                List<String> pre = new ArrayList<>();
                pre.add(strs[i]);
                res.put(new String(key),pre);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> an : res.values()){
            ans.add(an);
        }
    return ans;
    }
}
