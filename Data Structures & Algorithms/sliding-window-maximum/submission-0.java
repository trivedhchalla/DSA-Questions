class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = -10001;
        int l = 0;
        int r = 0;
        int start = 0;
        int[] ans = new int[nums.length - k + 1];
        for(int i = 0; i < k; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            r++;
        }
        ans[start] = max;
        start++;
        while(r < nums.length){
            if(nums[r] > max){
                max = nums[r];
                ans[start] = max;
            }else if(nums[l] == max){
                max = maxi(nums,l + 1, r);
                ans[start] = max;
            }else{
                ans[start] = max;
            }
            start++;
            l++;
            r++;
        }
        return ans;
    }

    private int maxi(int[] nums, int l, int r){
        int ans = -10001;
        for(int i = l; i <= r; i++){
            if(ans < nums[i]){
                ans = nums[i];
            }
        }
        return ans;
    }

}
