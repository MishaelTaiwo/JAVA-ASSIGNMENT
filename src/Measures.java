import java.util.Arrays;

public class Measures {
    public static void main(String[] args) {
        // Given array
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        int n = data.length;

        // Sort the array for calculating the median
        Arrays.sort(data);

        // Calculate the mean
        double mean = calculateMean(data);

        // Calculate the median
        double median = calculateMedian(data);

        // Calculate the standard deviation
        double stdDev = calculateStandardDeviation(data, mean);

        // Print the results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] data) {
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2.0; // Average of two middle elements
        } else {
            return data[n / 2]; // Middle element
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] data, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : data) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / data.length);
    }
}


