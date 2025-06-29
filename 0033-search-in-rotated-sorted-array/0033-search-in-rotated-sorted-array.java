class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length -1;
        while(l<=r){
            int mid = (l + r)/2;
            if (nums[mid] == target) return mid;
            //to check if the left portion of nums[mid] is sorted
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target < nums[mid]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }//if the left is not sorted then the right has to be
            } else{
                if(nums[r] >= target && target > nums[mid]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}