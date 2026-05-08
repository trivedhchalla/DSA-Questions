class Solution {
    List<List<Integer>> ans = new ArrayList<>(); 
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backTrack(new ArrayList<>(), target, nums, 0);
        return ans;
    }

    public void backTrack(List<Integer> subset, int sum, int[] nums, int index){
        if(sum == 0){
            ans.add(new ArrayList<>(subset));
            return ;
        }
        if(sum < 0){
            return ;
        }
        for(int i = index; i < nums.length; i++){
            subset.add(nums[i]);
            backTrack(subset, sum - nums[i], nums, i);
            subset.remove(subset.size() - 1);
        }
    }

}
