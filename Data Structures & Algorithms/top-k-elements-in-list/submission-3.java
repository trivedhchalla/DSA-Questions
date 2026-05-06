class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            // adding the number with its frequency if already existing then increace the freq count 
            map.put(i, map.getOrDefault(i, 0) + 1);
        }   
        // for storing the number with same frequency as list 
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);// get frequency as its used as the index accessor in bucket array  
            if(bucket[freq] != null){
                bucket[freq].add(key);
            }else{
                List<Integer> inner = new ArrayList<>();
                bucket[freq] = inner;
                inner.add(key);
            }
        }
        int[] ans = new int[k];
        int i = 0 ;
        for(int indx = bucket.length - 1; indx >= 0 && i < k; indx --){
            if(bucket[indx] != null){
                for(int num : bucket[indx])
                ans[i ++] = num;
            }
        } 
        return ans;
    }
}
