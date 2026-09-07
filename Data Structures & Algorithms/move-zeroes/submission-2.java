class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]!=0){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
            }
        }
        
    }
}