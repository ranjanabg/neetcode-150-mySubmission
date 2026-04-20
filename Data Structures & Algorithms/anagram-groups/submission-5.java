class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapAnagrams = new HashMap<>();

        for (String s : strs) {
            int[] alphabets = new int[26];

            for (char c : s.toCharArray()) {
                alphabets[c - 'a']++;
            }

            String key = Arrays.toString(alphabets);

            if (!mapAnagrams.containsKey(key)) {
                mapAnagrams.put(key, new ArrayList<>());
            }

            mapAnagrams.get(key).add(s);
        }

        return new ArrayList<>(mapAnagrams.values());
    }
}
