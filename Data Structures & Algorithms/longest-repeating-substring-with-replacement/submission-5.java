class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();

        int maxLen = 0;
        int l = 0;
        int count = 0;

        for (int r = 0; r < s.length(); r++) {
            freqMap.put(s.charAt(r), freqMap.getOrDefault(s.charAt(r), 0) + 1);
            count = Math.max(count, freqMap.get(s.charAt(r)));

            while ((r - l + 1) - count > k) {
                freqMap.put(s.charAt(l), freqMap.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;

    }
}
