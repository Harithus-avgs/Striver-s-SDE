class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else{
                c2++;
            }

		}
        for(int j=0;j<c0;j++){
            nums[j]=0;
        }
        for(int j=c0;j<c0+c1;j++){
            nums[j]=1;
        }
        for(int j=c0+c1;j<nums.length;j++){
            nums[j]=2;
        }
    }
}