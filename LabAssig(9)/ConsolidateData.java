import java.io.*;
import java.util.Arrays;

public class ConsolidateData {
    public static void main(String[] args) {
        // Specify the input files and output file
        String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
        String outputFile = "consolidated_data.txt";

        try {
            // Read data from input files
            int[][] data = readData(inputFiles);

            // Combine data and calculate averages
            int[] columnSums = new int[data[0].length];
            for (int[] row : data) {
                for (int j = 0; j < row.length; j++) {
                    columnSums[j] += row[j];
                }
            }

            int numRows = data.length;
            double[] columnAverages = new double[columnSums.length];
            for (int i = 0; i < columnSums.length; i++) {
                columnAverages[i] = (double) columnSums[i] / numRows;
            }

            // Write consolidated data and averages to the output file
            writeData(outputFile, data, columnAverages);

            System.out.println("Consolidation complete. Data saved to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] readData(String[] inputFiles) throws IOException {
        int numRows = 0;
        int numCols = 0;

        // Determine the number of rows and columns in the data
        for (String inputFile : inputFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line = reader.readLine();
                if (line != null) {
                    numCols = line.split("\t").length;
                }

                while (line != null) {
                    numRows++;
                    line = reader.readLine();
                }
            }
        }

        // Initialize the data array
        int[][] data = new int[numRows][numCols];

        // Read data from input files and populate the array
        int currentRow = 0;
        for (String inputFile : inputFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line = reader.readLine();
                while (line != null) {
                    String[] values = line.split("\t");
                    for (int j = 0; j < numCols; j++) {
                        data[currentRow][j] = Integer.parseInt(values[j]);
                    }
                    currentRow++;
                    line = reader.readLine();
                }
            }
        }

        return data;
    }

    private static void writeData(String outputFile, int[][] data, double[] columnAverages) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Write data to the output file
            for (int[] row : data) {
                writer.write(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
                writer.newLine();
            }

            // Write column averages to the output file
            writer.write("Column Averages: " + Arrays.toString(columnAverages));
        }
    }
}
