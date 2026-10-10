class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];

        for (int pos = nums.length - 1; pos >= 0; pos--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                arr[pos] = nums[left] * nums[left];
                left++;
            } else {
                arr[pos] = nums[right] * nums[right];
                right--;
            }
        }

        return arr;
    }
}