package com.zyb.solutions;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("reverse:" + solution.reverse(1463847412));
		int[] nums1 = { 1, 2, 3 ,4};
		int[] nums2 = {5, 7, 8, 9 };
		System.out.println("findMedianSortedArrays:"
				+ solution.findMedianSortedArrays(nums1, nums2));
	}
}
