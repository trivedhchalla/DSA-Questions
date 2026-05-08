class Solution {
    Set<List<Integer>> ans = new HashSet<>(); 
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(new ArrayList<>(), target, candidates, 0);
        return new ArrayList<>(ans);
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
            backTrack(subset, sum - nums[i], nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

}
