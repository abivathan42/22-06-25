import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 6, 5};
        int key = 6;

        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Linear Search: Found at index " + i);
                break;
            }
        }

        // Binary Search
        Arrays.sort(arr); // binary search needs sorted array
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Binary Search: Found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
