import java.util.Scanner;

public class LongestPrefixSuffix {

    // Function to calculate the length of the longest proper prefix which is also a proper suffix
    public static int findLongestPrefixSuffix(String str) {
        int n = str.length();
        
        // Create lps[] array to store the length of the longest prefix suffix
        int[] lps = new int[n];
        int length = 0;  // Length of the previous longest prefix suffix
        int i = 1;

        // lps[0] is always 0 because there is no proper prefix or suffix for a single character
        lps[0] = 0;

        // Build the lps array
        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    // Set length to the value of the previous longest prefix suffix
                    length = lps[length - 1];
                } else {
                    // If no match and length is already 0, just set lps[i] to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // The longest proper prefix which is also a suffix is the value at lps[n-1]
        return lps[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        int result = findLongestPrefixSuffix(str);
        System.out.println("The length of the longest proper prefix which is also a proper suffix is: " + result);
    }
}
