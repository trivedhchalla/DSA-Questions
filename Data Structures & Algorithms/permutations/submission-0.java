class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums,new HashSet<Integer>(), new ArrayList<Integer>(),ans);
        return ans;
    }

    public void permutation(int[]nums, Set<Integer> path, List<Integer> subSet, List<List<Integer>> ans){
        if(subSet.size() == nums.length){
            ans.add(new ArrayList<>(subSet));
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(!path.contains(i)){
                subSet.add(nums[i]);
                path.add(i);
                permutation(nums, path, subSet, ans);
                path.remove(i);
                subSet.remove(subSet.size() - 1);
            }
        }
    }

}
