class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int prod = 1;
        int pdWithZero = 1;
        for(int num : nums){
            prod *= num;
            if(num != 0){pdWithZero *= num;}
            if(num == 0)count++;
        }
        if(count > 1){
            return new int[nums.length];
        }
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = (nums[i] != 0) ? prod / nums[i] : pdWithZero;
        }
    return arr;
    }
}  
