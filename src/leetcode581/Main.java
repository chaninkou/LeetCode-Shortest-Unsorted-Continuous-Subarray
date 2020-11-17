package leetcode581;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {4,3,2,1,6,7,8,9};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMinUnsortedContinuous solution = new FindMinUnsortedContinuous();
		
		System.out.println("Solution: " + solution.findUnsortedSubarray(nums));
	}
}
