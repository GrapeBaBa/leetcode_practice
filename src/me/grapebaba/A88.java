package me.grapebaba;


public class A88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index2 = n - 1;
        int index1 = m - 1;
        int index = m + n - 1;

        while (index2 >= 0) {
            if (index1 < 0 || nums2[index2] >= nums1[index1]) {
                nums1[index] = nums2[index2];
                index--;
                index2--;
            } else {
                nums1[index] = nums1[index1];
                index--;
                index1--;
            }
        }

    }
}
