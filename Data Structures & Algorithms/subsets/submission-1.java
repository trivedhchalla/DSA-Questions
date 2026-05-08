class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(new ArrayList<>(), nums, 0);
        return ans;
    }

    public void backTrack(List<Integer> subset,int[] nums, int index){
        if(index > nums.length){
            return ;
        }
        ans.add(new ArrayList<>(subset));
        for(int i = index; i < nums.length; i++){
            subset.add(nums[i]);
            backTrack(subset,nums,i + 1);
            subset.remove(subset.size() - 1);  
        }
    }

}
