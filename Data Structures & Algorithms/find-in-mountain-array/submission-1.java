/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int binSearch1(MountainArray nums, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public int binSearch2(MountainArray nums, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        int mid;
        int minlow = Integer.MIN_VALUE;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int pivot = low;
        int left = binSearch1(mountainArr, 0, pivot, target);
        int right = binSearch2(mountainArr,pivot + 1,mountainArr.length() - 1,target);
        if(left != -1){
                return left;
        }else if(mountainArr.get(pivot) == target){
                return pivot;
        }else if(right != -1){
                return right;
        }else{
                return -1;
        }
    }
}