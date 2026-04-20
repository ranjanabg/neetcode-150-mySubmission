class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char d : t.toCharArray()) {
            arr[d - 'a']--;
        }

        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
