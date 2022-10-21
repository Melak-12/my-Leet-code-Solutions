class KthLargest {
    int K;
    PriorityQueue <Integer> pq;
    public KthLargest(int k, int[] nums) {
        K = k;
        pq = new PriorityQueue <Integer> ();
        for(int x : nums) {
            pq.add(x);
            if(pq.size() > k) {
                pq.remove();
            }
        }
    }
    int add(int val) {
        pq.add(val);
        if(pq.size() > K)
            pq.remove();
        return pq.peek();
    }
}
