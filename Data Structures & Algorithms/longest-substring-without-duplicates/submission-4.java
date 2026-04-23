class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int length = 0;

        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
                continue;
            }

            set.add(s.charAt(r));
            length = Math.max(length, r - l + 1);
            r++;
        }

        return length;
    }
}
