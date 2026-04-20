class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] nums3 = new int[nums1.length + nums2.length];

        while (p3 < nums3.length) {
            if (p1 < nums1.length && p2 >= nums2.length) {
                nums3[p3++] = nums1[p1++];
                continue;
            }

            if (p1 >= nums1.length && p2 < nums2.length) {
                nums3[p3++] = nums2[p2++];
                continue;
            }

            if (nums1[p1] <= nums2[p2]) {
                nums3[p3++] = nums1[p1++];
            } else {
                nums3[p3++] = nums2[p2++];
            }

        }
        for (int num : nums3) {
            System.out.println(num);
        }

        double median = 0.0;
        int mid = nums3.length / 2;
        if (nums3.length % 2 == 0) {
            median = (nums3[mid] + nums3[mid - 1]);
            //System.out.println(median);
            median = median / 2;
        } else {
            median = nums3[mid];
        }

        return median;
    }
}
