class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int start = 0;
        List<Integer> c = new ArrayList<>();
        powerSet(c,start,nums.length - 1,nums);
        return res;
    }

    public void powerSet(List<Integer> c, int s, int n,int[] a){
        if(s > n){
            res.add(new ArrayList<>(c));
        }else{
            c.add(a[s]);
            powerSet(c,s+1,n,a);
            c.remove(c.size() - 1);
            powerSet(c,s+1,n,a);
        }

    }
}
