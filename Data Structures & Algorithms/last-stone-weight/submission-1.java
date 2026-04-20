class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            int crashed = stone1 - stone2;
            System.out.println(crashed);

            maxHeap.offer(crashed);
        }

        return maxHeap.size() == 0 ? 0 : maxHeap.poll();
    }
}
