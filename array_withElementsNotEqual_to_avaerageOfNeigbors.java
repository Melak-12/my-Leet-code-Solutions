class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int[] rearrange = new int[size];
        int left = 0, right = size - 1;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                rearrange[i] = nums[left];
                left++;
            } else {
                rearrange[i] = nums[right];
                right--;
            }
        }
        return rearrange;
    }
}
