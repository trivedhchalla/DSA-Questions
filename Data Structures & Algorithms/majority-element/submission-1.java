class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int majEle = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i]) > (nums.length / 2)){
                majEle = nums[i];
            }
        }
        return majEle;
    }
}