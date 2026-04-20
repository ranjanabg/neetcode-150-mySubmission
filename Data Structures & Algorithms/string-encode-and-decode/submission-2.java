class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        int i = 0; 
        List<String> decoded = new ArrayList<>();

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j = j + 1;
            }
            int size = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + size;
            decoded.add(str.substring(i, j));
            i = j;
        }

        return decoded;
    }
}
