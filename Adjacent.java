public class Adjacent {
    public static int findTotalDistance(int n, int[] arr) {
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            total += Math.abs(arr[i] - arr[i + 1]);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 7, 12, 14};
        int n = arr.length;
        System.out.println("Total Distance: "
                + findTotalDistance(n, arr));
    }
}