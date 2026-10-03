public class searchmatrixLc74 {
    public static void main(String[] args) {
       int[][] matrix = {
    {1, 3, 5},
    {10, 11, 16},
    {23, 30, 34}
};
        int target = 10;

       System.out.println(searchInMatrix(matrix, target)); 
    }
    

    public static boolean searchInMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = (row * col) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[mid / col][mid % col] == target) {
                return true;
            } else if (matrix[mid / col][mid % col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return  false;
    }
}