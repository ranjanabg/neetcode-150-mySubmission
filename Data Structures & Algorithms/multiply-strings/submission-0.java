class Solution {
    public String multiply(final String num1, final String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String result = "0";

        for (int i = num2.length() - 1; i >= 0; i--) {
            int product = 0;
            int carry = 0;
            final StringBuilder productStr = new StringBuilder();

            for (int j = num1.length() - 1; j >= 0; j--) {
                int c2 = (num2.charAt(i) - '0');
                int c1 = (num1.charAt(j) - '0');

                product = (c2 * c1) + carry;
                carry = product / 10;
                product = product % 10;
                
                productStr.append(product);
            }

            if (carry != 0) {
                productStr.append(carry);
            }

            productStr.reverse();

            for (int k = 0; k < num2.length() - 1 - i; k++) {
                productStr.append(0);
            }

            result = this.add(productStr.toString(), result);
            System.out.println(result);
        }

        return result;
    }

    public String add(final String num1, final String num2) {
        final StringBuilder result = new StringBuilder();
        
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; (i >= 0 || j >= 0); i--, j--) {
            int num1digit = i >= 0 ?  num1.charAt(i) - '0' : 0;
            int num2digit = j >= 0 ?  num2.charAt(j) - '0' : 0;

            int sum = num1digit + num2digit + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.append(sum);
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

}
