class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && target<=matrix[i][matrix[0].length-1]){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }

    public Boolean binarySearch(int[] arr,int val){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid= l + (r-l)/2 ;
            if(arr[mid]==val){
                return true;
            }
            else if(arr[mid]>val){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}