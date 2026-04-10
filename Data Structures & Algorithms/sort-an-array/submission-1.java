class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums,low,high);
        return nums;
    }
    public void quickSort(int[] arr,int low, int high){
        
        if(low < high){
            int pivot = partition(arr,low,high);
            // since the pivot in correct pos we will not take it
            quickSort(arr,low,pivot - 1);
            quickSort(arr,pivot+1,high);
        }
    }
    public int partition(int[] arr,int low,int high){
        int i = low + 1;
        int j = high;
        int pivot = arr[low];
        while(i <= j){
            while(i <= high && pivot >= arr[i]){
                i++;
            }
            while(j >= low && pivot < arr[j]){
                j--;
            }
            // pivot meaning the left ones are less and right are high values 
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                break;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}