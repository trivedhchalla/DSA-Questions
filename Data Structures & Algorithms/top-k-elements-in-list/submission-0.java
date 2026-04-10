class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // bucket sort with just some changes 
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);
                if(bucket[freq] != null){
                    bucket[freq].add(key);
                }else{
                    List<Integer> li = new ArrayList<>();
                    bucket[freq] = li;
                    li.add(key);
            }
        }
        int[] ans = new int[k];
        for(int i = bucket.length - 1; i >= 0 && k > 0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    ans[k -1] = num;
                    k--;
                    if(k == 0){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
