class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }

        
        for (char c : s.toCharArray()) {
            int l = 0; int count = 0;

            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c) {
                    count++;
                }

                while ((r - l + 1) - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }

                res = Math.max(res, r - l + 1);
            }


        }
        return res;
    }
}
