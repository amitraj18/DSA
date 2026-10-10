class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0,temp;
        for(int fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=0){
                temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
            }
        }
    }
}