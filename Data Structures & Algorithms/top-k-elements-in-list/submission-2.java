class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Set<Integer> set = new  HashSet<>();
        for(int i = 0; i < nums.length; i++){
            maxHeap.add(nums[i]);  
        }
        while(set.size() != k){
            set.add(maxHeap.poll());  
        }
        int[] ans = set.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
