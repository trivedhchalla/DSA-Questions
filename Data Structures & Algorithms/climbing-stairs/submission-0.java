class Solution {
    Map<Integer, Integer> rem = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int one ;
        int sec ;
        if(!rem.containsKey(n - 1)){
            rem.put(n-1,climbStairs(n - 1));
        }
        one = rem.get(n - 1);
        if(!rem.containsKey(n - 2)){
            rem.put(n-2,climbStairs(n - 2));
        }
        sec = rem.get(n-2);
        return one + sec;
    }
}
