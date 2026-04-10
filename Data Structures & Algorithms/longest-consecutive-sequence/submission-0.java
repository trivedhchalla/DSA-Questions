class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            set.add(num);
        }
        int count,curr;
        for(int i = 0; i < nums.length; i++){
            count = 1;
            curr = nums[i];
            while(set.contains(curr + 1)){
                curr++;
                count++;
            }
            if(count > ans){
                ans = count;
            }
        }
    return ans;
    }
}
