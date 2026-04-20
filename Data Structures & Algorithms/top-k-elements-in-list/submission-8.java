class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
       

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i], 0) +1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> (a[1] - b[1]));

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            heap.offer(new int[]{entry.getKey(), entry.getValue()});

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] topK = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            topK[i] = heap.poll()[0];
            i++;
        }
        return topK;
    }
}
