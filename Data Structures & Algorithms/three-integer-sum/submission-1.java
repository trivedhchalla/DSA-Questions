class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int left = 0;
        Arrays.sort(nums);
        for(;left < nums.length - 2; left++){
            if (left > 0 && nums[left] == nums[left - 1]) continue;
            int j = left + 1;
            int right = nums.length - 1;
            while(j < right){
                if(nums[left] + nums[j] + nums[right] == 0){
                    ans.add(Arrays.asList(nums[left],nums[j],nums[right]));
                    while(j < right && nums[j + 1] == nums[j]){
                        j++;
                    }
                    while(j < right && nums[right- 1] == nums[right]){
                        right--;
                    }
                    j++;
                    right--;
                }else if(nums[left] + nums[j] + nums[right] < 0){
                    j++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
