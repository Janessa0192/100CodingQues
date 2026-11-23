class Solution {
    public int maxSubArray(int[] nums) {
        
       
        int max_sum=Integer.MIN_VALUE;
        int sum=0;

        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<nums.length;i++){

           sum+=nums[i];
        
           max_sum = Math.max(sum,max_sum);
           if(sum<=0) sum = 0;
           
           
        }

        return max_sum;
    }
}