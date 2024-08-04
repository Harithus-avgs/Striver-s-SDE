class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            int sum=0;
            for(int j=i;j<nums.length;++j){
                sum+=nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        int ans=0;
        final int mod = (int) 1e9 + 7;
        for(int i=left-1;i<right;++i){
            ans=(ans+list.get(i)) % mod;
        }
        return ans;
    }
}