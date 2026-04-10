class Solution {
    public int[] mergeSort(int[] arr,int low,int high){
        if(low == high){
            return new int[]{arr[low]};
        }
        int mid = low + (high - low)/2;
        int[] left = mergeSort(arr,low,mid);
        int[] right = mergeSort(arr,mid+1,high);
        return merge(left,right);
    }
    public int[] merge(int[] left,int[] right){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans.add(left[i]);
                i++;
            }else{
                ans.add(right[j]);
                j++;
            }                            
        }
        while(i < left.length){
            ans.add(left[i]);
            i++;
        }
        while(j < right.length){
            ans.add(right[j]);
            j++;
        }
        return ans.stream().mapToInt(x -> x).toArray();
    }

    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        return mergeSort(nums,low,high);
    }
}