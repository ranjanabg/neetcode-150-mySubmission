class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
        }

        int length = nums.length - k;
        int number = 0;
        for (int i = 0; i <= length; i++) {
            number = pq.poll();
        }
        return number;
    }
}
