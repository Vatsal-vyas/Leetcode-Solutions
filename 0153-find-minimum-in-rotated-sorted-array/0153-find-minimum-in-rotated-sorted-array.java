class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1, ans = nums[0];   
        while(l<=r){
            int mid = (l + r)/2;
            if(nums[l] < nums[r]){
                ans = Math.min(ans, nums[l]);
              }
             ans = Math.min(ans, nums[mid]);
            if(nums[mid] >= nums[l]){
                l = mid + 1;
            }else{
                r = mid - 1;
            } 
        }
        return ans;
    }
}