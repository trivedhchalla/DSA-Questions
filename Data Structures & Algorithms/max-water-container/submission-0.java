class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE ;
        int currArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right){
            if(heights[left] <= heights[right]){
                currArea = (right - left) * heights[left];
                left++;
            }else{
                currArea = (right - left) * heights[right];
                right--;
            }
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}
