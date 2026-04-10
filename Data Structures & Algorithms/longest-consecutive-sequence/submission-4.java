class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxAns = 0;
        for(int i = 0; i < nums.length ; i++){
            int ans = 1;
            if(set.contains(nums[i] + 1)){
                ++ans;
                int target = nums[i] + 2;
                while(set.contains(target)){
                    target ++;
                    ++ans;
                }
            }
            maxAns = Math.max(maxAns,ans);
        }
        return maxAns;
    }
}
