class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> temp = new ArrayList<>();
        temp.add(strs[0]);
        map.put(strs[0], temp);

        for (int i = 1; i < strs.length; i++) {
            boolean found = false;
            for (final String anagramGroupRep: map.keySet()) {
                if (validAnagram(strs[i], anagramGroupRep)) {
                    map.get(anagramGroupRep).add(strs[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(strs[i], temp);
            }
        }

        return map.values().stream().collect(Collectors.toList());
    }

    public boolean validAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] alphabets = new int[26];

        for (char c : s1.toCharArray()) {
            alphabets[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            alphabets[c - 'a']--;
        }

        for (int num : alphabets) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
