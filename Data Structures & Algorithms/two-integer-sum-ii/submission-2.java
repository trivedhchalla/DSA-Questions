class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < numbers.length; i ++){
            if(map.containsKey(numbers[i])){
                ans[0] = map.get(numbers[i]) + 1;
                ans[1] = i + 1;
                return ans;
            }else{
                map.put(target - numbers[i],i);
            }
        }
        return ans;
    }
}
