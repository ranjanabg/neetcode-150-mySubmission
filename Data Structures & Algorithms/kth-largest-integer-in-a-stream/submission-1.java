class KthLargest {
    private int k;
    private Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num: nums) {
            q.offer(num);
        }
    }
    
    // O(klog(n))
    public int add(int val) {
        q.offer(val); // O(log(n))

        List<Integer> vals = new ArrayList<>(); // O (k)
        for (int i = 0; i < k; i++) {
            vals.add(q.poll());
        }
        //O (klog(n))
        for (Integer value: vals) { 
            q.offer(value);
        }

        return vals.get(vals.size() - 1);
    }
}
