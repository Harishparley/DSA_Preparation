class searchinrotatedsortedarraylc33 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            int current = matrix[r][c];

            if (current == target) {
                return true;
            } else if (current > target) {
                c--;
            } else {
                r++;
            }
        }

        return false; 
    }
}