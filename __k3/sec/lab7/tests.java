package __k3.sec.lab7;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.special.Erf;

public class tests {
    private static String path = "__k3//sec//lab7//";
    public static double calculateFrequencyTestPValue(int onesCount, int zerosCount, int length) {
        int n = length;
        int x = onesCount;

        BinomialDistribution binomialDistribution = new BinomialDistribution(n, 0.5);
        double pValue = 1 - binomialDistribution.cumulativeProbability(x - 1);

        return pValue;
    }

    public static double calculateRunTestPValue(String sequence) {
        int runs = 1;
        char currentBit = sequence.charAt(0);
    
        for (int i = 1; i < sequence.length(); i++) {
            char bit = sequence.charAt(i);
            if (bit != currentBit) {
                runs++;
                currentBit = bit;
            }
        }
    
        int n = sequence.length();
        int N1 = (n + 2) / 3;
        int N2 = (n + 1) / 2;
    
        double mean = (2 * N1 * N2) / n + 1;
        double variance = (2 * N1 * N2 * (2 * N1 * N2 - n)) / ((n - 1) * n * n);
    
        double z = (runs - mean) / Math.sqrt(variance);
    
        double runTestPValue = 1 - Math.abs(Erf.erf(z / Math.sqrt(2)));
    
        return runTestPValue;
    }
    
    public static double calculateCumulativeSumsTestPValue(String sequence) {
        int n = sequence.length();
        double[] cumulativeSums = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            char bit = sequence.charAt(i);
            if (bit == '0') {
                sum -= 1;
            } else {
                sum += 1;
            }
            cumulativeSums[i] = sum;
        }

        double maxCumulativeSum = Math.abs(cumulativeSums[0]);
        for (int i = 1; i < n; i++) {
            maxCumulativeSum = Math.max(maxCumulativeSum, Math.abs(cumulativeSums[i]));
        }

        double expectedValue = -0.25 * n + 0.5;
        double standardDeviation = Math.sqrt(n * (n + 2) / 12.0);

        double z = (maxCumulativeSum - expectedValue) / standardDeviation;

        double cumulativeSumsTestPValue = 1 - Math.abs(Erf.erf(z / Math.sqrt(2)));

        return cumulativeSumsTestPValue;
    }


    
    public static void saveTestResultsToFile(double frequencyTestPValue, double runTestPValue, double SumsTestPValue) {
        try {
            FileWriter fileWriter = new FileWriter(path + "test_results.txt");
            fileWriter.write("Frequency Test P-value: " + frequencyTestPValue + "\n");
            fileWriter.write("Run Test P-value: " + runTestPValue + "\n");
            fileWriter.write("Sums Test P-value: " + SumsTestPValue + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSequenceToFile(String sequence) {
        try {
            FileWriter fileWriter = new FileWriter(path+"random_sequence.txt");
            fileWriter.write(sequence);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveKeyToFile(String sequence) {
        try {
            FileWriter fileWriter = new FileWriter(path+"random_Key.txt");
            fileWriter.write(sequence);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
