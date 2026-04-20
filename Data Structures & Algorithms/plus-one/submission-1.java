class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int sum = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            sum += digits[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.add(0, sum);
            sum = 0;
        }

        if (carry != 0) {
            result.add(0, carry);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
