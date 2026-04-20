class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int window[] = new int[26];

        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int l = 0;
        int r = 0;
        int length = s1.length();
        while (r < s2.length()) {
            window[s2.charAt(r) - 'a']++;
            r++;

            if (r - l > length) {
                window[s2.charAt(l) - 'a']--;
                l++;
            }

            if (r - l == length && matched(need, window)) {
                return true;
            } 
        }

        return false;
    }

    private boolean matched(int[] need, int[] window) {
        for (int i = 0; i < need.length; i++) {
            if (need[i] != window[i]) {
                return false;
            }
        }

        return true;
    }
}
