public class FindMissingAndRepeating {
    
    public static void findMissingAndRepeating(int[] arr, int n) {
        int repeating = -1, missing = -1;
        
        // Step 1: Mark the elements
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Step 2: Find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
            }
        }

        System.out.println("Repeating number is: " + repeating);
        System.out.println("Missing number is: " + missing);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2};
        int n1 = arr1.length;
        findMissingAndRepeating(arr1, n1);  // Output: Repeating number is: 2, Missing number is: 1

        int[] arr2 = {1, 3, 3};
        int n2 = arr2.length;
        findMissingAndRepeating(arr2, n2);  // Output: Repeating number is: 3, Missing number is: 2
    }
}
