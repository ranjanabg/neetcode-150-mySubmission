class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grouped = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        if (strs.length == 0) {
            return grouped;
        }

        for (String s : strs) {
            int[] frequencyArr = new int[26];

            for (char c : s.toCharArray()) {
                frequencyArr[c - 'a']++;
            }

            String key = Arrays.toString(frequencyArr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        grouped.addAll(map.values());

        return grouped;
    }
}
