class Solution {
    public void setZeroes(int[][] matrix) {
        // Your code goes here
        int m = matrix.length; //rows
        int n = matrix[0].length; //column
        boolean flag = true;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int col = 0; col<n; col++)
                    {
                        if(matrix[i][col]!=0)
                        {
                            matrix[i][col]=Integer.MIN_VALUE+2;
                            flag = false;
                        }
                    }
                    for(int row = 0; row<m; row++)
                    {
                        if(matrix[row][j]!=0)
                        {
                            matrix[row][j]=Integer.MIN_VALUE+2;
                            flag = false;
                        }
                    }
                }
            }
        }
        if(flag == false)
        {
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<n; j++)
                    {
                        if(matrix[i][j]==Integer.MIN_VALUE+2)
                            {
                                matrix[i][j]=0;
                             }
                    }
            }
        }
        else
        return;
        
        
    }
}