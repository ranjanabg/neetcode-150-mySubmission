class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for (char c1 : s.toCharArray()) {
            arr[c1 - 'a']++;
        }

        for (char c2 : t.toCharArray()) {
            arr[c2 - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
