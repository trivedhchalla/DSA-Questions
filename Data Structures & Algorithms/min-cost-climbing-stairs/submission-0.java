class Solution {
    Map<Integer, Integer> rem = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        int zero = dp(cost,0);
        int one = dp(cost,1);
        return Math.min(zero, one);
    }

    private int dp(int[] cost, int indx){
        if(indx >= cost.length){
            return 0;
        }
        if(!rem.containsKey(indx)){
            int one = dp(cost, indx + 1);
            int sec = dp(cost, indx + 2);
            rem.put(indx , cost[indx] +  Math.min(one,sec));
        }
        return rem.get(indx);
    }

}
