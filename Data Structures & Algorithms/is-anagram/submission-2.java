class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabets = new int[26];
        for (char c : s.toCharArray()) {
            alphabets[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            alphabets[c - 'a']--;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
