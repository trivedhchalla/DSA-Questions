class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        List<Integer> c = new ArrayList<>();
        backTrack(nums,0,c);
        return new ArrayList<>(res);
    }

    public void backTrack(int[] nums,int index,List<Integer> subSet){
        res.add(new ArrayList<>(subSet));
        for(int i = index; i < nums.length; i++){
            subSet.add(nums[i]);
            backTrack(nums, i + 1, subSet);
            subSet.remove(subSet.size() - 1);
        }
    }
    
}
