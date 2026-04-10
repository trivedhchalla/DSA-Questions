class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        sumSubset(new ArrayList<>(),0,0,nums.length - 1, target,nums);
        return res;
    }

    public void sumSubset(List<Integer> c, int sum,int s,int n, int t,int[] a){
        if(sum == t){
            res.add(new ArrayList<>(c));
            return ;
        }
        if(sum > t || s > n){return ;}
        sum += a[s];
        c.add(a[s]);
        sumSubset(c,sum,s,n,t,a);
        sum -= c.get(c.size() - 1);
        c.remove(c.size() - 1);
        sumSubset(c,sum,s+1,n,t,a);
    }
}
