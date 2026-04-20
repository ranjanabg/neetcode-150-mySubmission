class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((v1, v2) -> {
                    if (v1 > v2) {
                        return -1;
                    } else if (v1 < v2) {
                        return 1;
                    } else {
                        return 0;
                    }
                }))
                .map(e -> e.getKey())
                .collect(Collectors.toList())
                .subList(0,k)
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
