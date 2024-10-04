import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 2DArrayDS {

    /** HackerRank | START | Prepare > Data Structures > Arrays > 2D Array - DS (16 Hourglass in Arrays with 7 Element)

     * Example Test Case :
             0 -4 -6 0 -7 -6
             1 -2 -6 -8 -3 -1
             -8 -4 -2 -8 -8 -6
             -3 -1 -2 -5 -7 -4
             -3 -5 -3 -6 -6 -6
             -3 -6 0 -8 -6 -7
     */
    public static int hourglassSum(List<List<Integer>> arr) {
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                                            + arr.get(i+1).get(j+1) +
                          arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                finalSum = Math.max(finalSum, sum);
            }
        }

        return finalSum;
    }
    /** HackerRank | END | Prepare > Data Structures > Arrays > 2D Array - DS (16 Hourglass in Arrays with 7 Element) */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukin dong, Bang! : ");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("../2D-Array-DS/OUTPUT_PATH.txt"));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = 2DArrayDS.hourglassSum(arr);

        System.out.println(String.valueOf(result));

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}