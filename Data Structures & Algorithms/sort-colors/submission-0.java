class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;
        while(curr <= right){
            if(nums[curr] == 0){
                int temp = nums[curr];
                nums[curr] = nums[left];
                nums[left] = temp;
                curr++;
                left++;
            }else if(nums[curr] == 1){
                curr++;
            }else{
                int temp = nums[right];
                nums[right] = nums[curr];
                nums[curr] = temp;
                right--;
            }
        }
    }
}