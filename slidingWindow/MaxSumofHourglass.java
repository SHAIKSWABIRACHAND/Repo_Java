import java.util.*;

public class MaxSumofHourglass {

    // Function to compute max hourglass sum
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum =
                        arr.get(i).get(j)     + arr.get(i).get(j + 1)     + arr.get(i).get(j + 2) +
                                                arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    // Main method
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        arr.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        arr.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        int result = hourglassSum(arr);
        System.out.println("Maximum Hourglass Sum: " + result);
    }
}
