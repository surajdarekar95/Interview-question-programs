package SDET_pavan;

public class FindMaxAndMin_InArray {

	public static void main(String[] args) {

		int nums[]= {10,9,5,4,6,3};
		MaxAndMinArray_Elements(nums);
	}

	public static void MaxAndMinArray_Elements(int[] nums) {

		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] > max) 
			{
				max = nums[i];
			} else if (nums[i] < min) 
			{
				min = nums[i];
			}
		}
		
		System.out.println("maximum array element is "+max);
		System.out.println("minimum array element is "+min);

	}
}