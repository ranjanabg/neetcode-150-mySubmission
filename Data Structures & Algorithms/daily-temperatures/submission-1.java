class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];

        int i = 0;
        int j = 1;
        int temp = 0;

        while (i < temperatures.length - 1 && j < temperatures.length) {
            if (temperatures[j] > temperatures[i]) {
                temp++;
                output[i] = temp;
                temp = 0;
                i++;
                j = i + 1;
            } else {
                temp++;
                j++;
                if (j >= temperatures.length) {
                    output[i] = 0;
                    temp = 0;
                    i++;
                    j = i + 1;
                }
            }

        }

        return output;
    }
}
