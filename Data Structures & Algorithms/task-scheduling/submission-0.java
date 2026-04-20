class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int taskFreq : freq) {
            if (taskFreq > 0) {
                queue.offer(taskFreq);
            }
        }

        int cpuCycle = 0;
        Queue<int[]> q = new LinkedList<>();
        while (!queue.isEmpty() || !q.isEmpty()) {
            cpuCycle++;

            if (queue.isEmpty()) {
                cpuCycle = q.peek()[1];
            } else {
                int count = queue.poll() - 1;
                if (count > 0) {
                    q.offer(new int[]{count, cpuCycle + n});
                }
            }

            if (!q.isEmpty() && q.peek()[1] == cpuCycle) {
                queue.add(q.poll()[0]);
            }
        }

        return cpuCycle;

    }
}
