public class KthSmallestSimple {

    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        // Perform k iterations of selection sort
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1]; // kth smallest element
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest(arr, k));
    }
}
