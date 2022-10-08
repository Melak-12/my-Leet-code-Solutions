
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                pq.offer(matrix[i][j]);
                if(pq.size() > k)
                    pq.poll();
            }
        }
        return pq.poll();
    }
}
