class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length<=1){
            return;
        }
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    public void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public void reverse(int[] arr,int x,int y){
        while(x<y){
            swap(arr,x++,y--);
        }
    }
}