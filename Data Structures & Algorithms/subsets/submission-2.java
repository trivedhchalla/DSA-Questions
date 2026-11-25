class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(new ArrayList<Integer>(),nums,0);
        return ans;
    }

    public void backTrack(List<Integer> inner,int[] nums, int index){
        if(index >= nums.length){
            ans.add(new ArrayList<>(inner));
            return ;
        }
        if(!ans.contains(inner))ans.add(new ArrayList<>(inner));
        for(int i = index; i < nums.length; i++){
            inner.add(nums[i]);
            backTrack(inner,nums,i + 1);
            inner.remove(inner.size() - 1);
        }
        return ;
    }

}
