class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    public List<Integer> generateRow(int n){
        long ansVal=1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int i=1;i<n;i++){
            ansVal = ansVal*(n-i);
            ansVal = ansVal/i;
            temp.add((int)ansVal);
        }
        return temp;
    }
}