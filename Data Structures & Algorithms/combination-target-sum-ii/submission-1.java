class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        sumSubset(new ArrayList<>(),0,0,candidates.length - 1, target,candidates);
        return new ArrayList<>(res);
    }

    public void sumSubset(List<Integer> c, int sum,int s,int n, int t,int[] a){
        if(sum == t){
            res.add(new ArrayList<>(c));
            return ;
        }
        if(sum > t || s > n){return ;}
        sum += a[s];
        c.add(a[s]);
        sumSubset(c,sum,s + 1,n,t,a);
        sum -= c.get(c.size() - 1);
        c.remove(c.size() - 1);
        sumSubset(c,sum,s + 1,n,t,a);
    }
}
