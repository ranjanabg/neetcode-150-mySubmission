class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stoneWeight : stones) {
            pq.add(stoneWeight);
        }

        while (pq.size() > 1) {
            int val1 = pq.poll();
            int val2 = pq.poll();

            if (val1 > val2) {
                val1 = val1 - val2;
                pq.add(val1);
            }

        }

        if (pq.isEmpty()) {
            return 0;
        }

        return pq.poll();
    }
}
