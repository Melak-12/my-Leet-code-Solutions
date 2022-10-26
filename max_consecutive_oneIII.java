class Solution {

public int longestOnes(int[] A, int K) {
    int max = 0;
    for (int left = 0, right = 0; right < A.length; right++) {
        if (A[right] == 0) {
            if (K == 0) {
                while (A[left] == 1) {
                    left++;
                }
                left++;
            } else {
                K--;
            }
        }
        max = Math.max(right - left + 1, max);
    }
    return max;
}

};
