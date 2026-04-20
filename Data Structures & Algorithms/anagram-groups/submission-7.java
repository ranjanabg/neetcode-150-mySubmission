class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str : strs) {
            int[] alphabets = new int[26];
            for (char c : str.toCharArray()) {
                alphabets[c - 'a']++;
            }

            String key = Arrays.toString(alphabets);
            
            if (!grouped.containsKey(key)) {
                grouped.put(key, new ArrayList<>());
            }

            grouped.get(key).add(str);
        }

        return new ArrayList<>(grouped.values());
    }
}
