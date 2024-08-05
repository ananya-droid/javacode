import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(nums));

        int j = 0; 

       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(nums));
    }
}
