class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] index = new int[2];

        while (j > i) {
            if (numbers[i] + numbers[j] == target) {
                index[0] = i + 1;
                index[1] = j + 1;
                break;
            }
            
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return index;
    }
}
