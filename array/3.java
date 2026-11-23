
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int j=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j]){
                return true;
            } else {
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args){

        Solution obj = new Solution();
        int[] nums = {1,2,3,1};
        System.out.println(obj.containsDuplicate(nums));
    }
}