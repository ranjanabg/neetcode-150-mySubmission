class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> permutationList = new HashMap<>();

        for (String s : strs) {
            int[] alphabets = new int[26];
            for (char c : s.toCharArray()) {
                alphabets[c - 'a']++;
            }

            String key = Arrays.toString(alphabets);

            if (!permutationList.containsKey(key)) {
                permutationList.put(key, new ArrayList<>());
            }

            permutationList.get(key).add(s);
        }
        return new ArrayList<>(permutationList.values());
    }
}
