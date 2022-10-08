class Solution {
    public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> prq=new PriorityQueue<int[]>((pt1,pt2)->((pt2[0]*pt2[0]+pt2[1]*pt2[1])-(pt1[0]*pt1[0]+pt1[1]*pt1[1])));
            
        for(int[] point:points){
         prq.offer(point);
                if(prq.size() > k){
            prq.poll();
                }
        }
        int[][] ans = new int[k][2];
        while (k > 0) {
            ans[--k] = prq.poll();
        }
        return ans; 
    }
}
