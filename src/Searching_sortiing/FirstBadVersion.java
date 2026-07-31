package Searching_sortiing;

public class FirstBadVersion {
	
	 // Assume version 4 is the first bad version
    static int bad = 4;

    // Simulated LeetCode API
    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        FirstBadVersion obj = new FirstBadVersion();

        int n = 5;

        int answer = obj.firstBadVersion(n);

        System.out.println("First Bad Version = " + answer);
    }

}
