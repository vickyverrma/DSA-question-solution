class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; //rows
        int n = matrix[0].length; //column
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
               if(matrix[i][j]==0)
               {
                row[i]= true;
                column[j]= true;
               } 
            }
        }
        for(int i = 0; i<m; i++ )
        {
            for(int j = 0; j<n; j++)
            {
                if(row[i]==true || column[j]==true)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}