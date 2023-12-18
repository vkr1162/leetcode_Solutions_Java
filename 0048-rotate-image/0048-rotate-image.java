class Solution {
    public void rotate(int[][] matrix) {
         for(int i=0;i<matrix.length/2;i++) {
        	for(int j=0;j<matrix.length;j++) {
        		int c = matrix[i][j];
        		matrix[i][j] = matrix[matrix.length-i-1][j];
        		matrix[matrix.length-i-1][j] = c;
        	}
        }
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<i;j++) {
        		int c = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = c;
        	}
        }
    }
}