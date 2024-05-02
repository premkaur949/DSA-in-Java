import java.util.*;
import java.util.Arrays;

public class ChocolateDistribution {

    public static int chocolateDistribution(int arr[], int m) {
		if (arr.length == 0 || m == 0) {
			return 0;
		}

		Arrays.sort(arr);

		if (arr.length - 1 < m) {
			return -1;
		}

		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int nextWindow = i + m - 1;

			if (nextWindow >= arr.length)
				break;

			int diff = arr[nextWindow] - arr[i];

			min_diff = Math.min(min_diff, diff);
		}

		return min_diff;
	}

	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
		int m = 7;

		int result = chocolateDistribution(arr, m);

		if (result != -1) {
			System.out.println("Minimum difference is " + result);
		} else {
			System.out.println("Invalid input");
		}
	}
}
