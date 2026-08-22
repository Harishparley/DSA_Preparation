import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generatenew(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generatenew(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> current = new ArrayList<>();

            current.add(1);

            if (i > 0) {

                List<Integer> previous = result.get(i - 1);

                for (int j = 1; j < previous.size(); j++) {
                    current.add(previous.get(j - 1) + previous.get(j));
                }

            }

            if (i > 0) {
                current.add(1);
            }

            result.add(current);
        }

        return result;
    }

    // public static List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> triangle = new ArrayList<>();

    //     if (numRows <= 0) return triangle;

    //     for (int i = 0; i < numRows; i++) {
    //         List<Integer> row = new ArrayList<>();

    //         for (int j = 0; j <= i; j++) {
    //             if (j == 0 || j == i) {
    //                 row.add(1);
    //             } else {
    //                 int prevRowVal1 = triangle.get(i - 1).get(j - 1);
    //                 int prevRowVal2 = triangle.get(i - 1).get(j);
    //                 row.add(prevRowVal1 + prevRowVal2);
    //             }
    //         }
    //         triangle.add(row);
    //     }

    //     return triangle;
    // }


    
}


