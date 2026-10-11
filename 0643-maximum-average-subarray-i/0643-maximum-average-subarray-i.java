class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max;
        double windowsum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            windowsum=(windowsum+nums[i]);
            avg=windowsum/k;
        }
        max=avg;
        for(int i=k;i<nums.length;i++){
            windowsum=windowsum-nums[i-k]+nums[i];
            avg=windowsum/k;
             max=Math.max(max,avg);
        }
       ;
        return max;
    }
}