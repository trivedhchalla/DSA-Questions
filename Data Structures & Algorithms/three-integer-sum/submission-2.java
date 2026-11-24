class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {

            int target = -nums[j];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = j + 1; i < nums.length; i++) {

                if (map.containsKey(nums[i])) {

                    List<Integer> inner = new ArrayList<>();

                    inner.add(nums[j]);
                    inner.add(nums[map.get(nums[i])]);
                    inner.add(nums[i]);

                    Collections.sort(inner);

                    if (!ans.contains(inner)) {
                        ans.add(inner);
                    }
                }

                map.put(target - nums[i], i);
            }
        }

        return ans;
    }
}