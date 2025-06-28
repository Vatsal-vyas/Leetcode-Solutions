class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i =1; i<nums.length; i++){
            
            int temp = Math.max(nums[i], Math.max(nums[i]*min, nums[i]*max));
            min = Math.min(nums[i], Math.min(nums[i]*min, nums[i]*max));
            max = temp;
            ans = Math.max(max, ans);
            }
            return ans;
        }
    }
