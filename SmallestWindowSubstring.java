public class SmallestWindowSubstring {

    public static String findSmallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "-1";
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            windowCount[ch - 'a']++;

            if (windowCount[ch - 'a'] <= pCount[ch - 'a']) {
                count++;
            }

            while (count == p.length()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowCount[leftChar - 'a']--;

                if (windowCount[leftChar - 'a'] < pCount[leftChar - 'a']) {
                    count--;
                }
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "-1";
        }

        return s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        String s1 = "timetopractice";
        String p1 = "toc";
        System.out.println(findSmallestWindow(s1, p1));  // Output: "toprac"

        String s2 = "zoomlazapzo";
        String p2 = "oza";
        System.out.println(findSmallestWindow(s2, p2));  // Output: "apzo"
    }
}
