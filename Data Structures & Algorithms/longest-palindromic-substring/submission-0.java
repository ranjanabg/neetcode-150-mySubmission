class Solution {
    public String longestPalindrome(String s) {
        String longestSub = "";

        for (int i = 0; i < s.length(); i++) {
            // for odd length
            String odd = isPalindrome(i, i, s);
            if (odd.length() > longestSub.length()) {
                longestSub = odd;
            }

            // for even length
            String even = isPalindrome(i, i + 1, s);
            if (even.length() > longestSub.length()) {
                longestSub = even;
            }
        }

        return longestSub;
    }

    private String isPalindrome(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}
