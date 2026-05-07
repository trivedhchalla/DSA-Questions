class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int complement;
        int[] res = new int[2];
        for(int i = 0;i < nums.length; i++){
            complement = target - nums[i];
            if (map.containsKey(complement)){
                int idx1 = map.get(complement);
                int idx2 = i;
                if (idx1 < idx2) {
                    return new int[]{idx1, idx2};
                } else {
                    return new int[]{idx2, idx1};
                }
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
