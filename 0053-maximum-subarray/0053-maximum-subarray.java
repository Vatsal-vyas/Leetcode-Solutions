class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum =0, maxSum =nums[0]; 
        for(int i=0; i<nums.length; i++){
            if(currentSum<0){
                currentSum =0;
            }
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}