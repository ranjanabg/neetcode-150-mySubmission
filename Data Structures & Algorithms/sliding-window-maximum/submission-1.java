// optimized (Heap)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b)-> b[0] - a[0]);

        int[] output = new int[nums.length - k + 1];

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            maxHeap.add(new int[]{nums[j], j});

            if (j >= k - 1) {
                while (maxHeap.peek()[1] <= j - k) {
                    maxHeap.poll();
                }

                output[i++] = maxHeap.peek()[0];
            }
        }

        return output;
    }
}
