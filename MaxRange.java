public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, 6, 99};

        // Range is inclusive: indexes 1..4 -> values 2, 34, 5, 6 -> max is 34
        System.out.println(maxRange(arr, 1, 4));
    }

    static int maxRange(int[] arr, int start, int end) {
        // 1. Validate ONCE, before the loop.
        // Check null FIRST: calling arr.length on null would crash.
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Invalid range: start after end, or indexes outside the array.
        if (start > end || start < 0 || end >= arr.length) {
            return -1;
        }

        // 2. Assume the first element of the range is the max.
        int maxvalue = arr[start];

        // 3. Loop over INDEXES from start to end (inclusive).
        // i is an index, so compare i with end, not with arr[end].
        for (int i = start; i <= end; i++) {
            if (arr[i]>maxvalue) {
                maxvalue = arr[i]; // found a bigger value
            }
        }

        return maxvalue;
    }
}