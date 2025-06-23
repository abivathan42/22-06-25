import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 2, 4, 8};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
