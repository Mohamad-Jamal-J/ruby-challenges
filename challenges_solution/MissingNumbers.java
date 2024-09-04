import java.util.ArrayList;
import java.util.List;
public class MissingNumbers {
    // this function finds the missing values in a given array of non-negative integers.
    public static List<Integer> findMissingNumbers(int[] nums){
        // find the max value so that we can create an array of size max
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n > max)
                max = n;
            if (n < 0) // my program assumes the values should be non-negative
                return null;
        }

        // mark the values in the given array as seen
        List<Integer> missing = new ArrayList<>();
        boolean[] seen = new boolean[max];
        for (int n: nums){
            seen[n-1] = true;
        }

        // find the missing values (unmarked values)
        for (int i = 0; i < seen.length; i++){
            if (!seen[i]){
                missing.add(i+1);
            }
        }
        return missing;
    }
}
