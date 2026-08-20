class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // transpose the matrix then reverse it 
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                swap(matrix,i,j);
            }
        }
        // reverse each row
        for(int i = 0; i<n; i++)
        {
            int start = 0; 
            int end = n-1;
            while(start<end)
            {
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }
    private static void swap(int[][] matrix, int i, int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}