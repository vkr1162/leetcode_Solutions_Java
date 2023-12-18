class Solution {
    public void setZeroes(int[][] matrix) {
      boolean firstRow = false;
   boolean firstCol = false;
   
   for(int i=0;i<matrix.length;i++) {
	   if(matrix[i][0]==0) {
		   firstRow = true;
	   }
   }
   for(int j=0;j<matrix[0].length;j++) {
	   if(matrix[0][j]==0) {
		   firstCol = true;
	   }
   }
   for(int i=1;i<matrix.length;i++) {
	   for(int j=1;j<matrix[i].length;j++) {
		   if(matrix[i][j]==0) {
			   matrix[0][j] = 0;
			   matrix[i][0] = 0;
		   }
	   }
   }
   
   for(int i=1;i<matrix.length;i++) {
	   for(int j=1;j<matrix[i].length;j++) {
		   if(((matrix[0][j]==0)||(matrix[i][0]==0))) {
			   matrix[i][j] = 0;
		   }
	   }
   }
   for(int i=0;i<matrix.length;i++) {
	   if(firstRow==true) {
		   matrix[i][0] = 0;
	   }
   }
   for(int j=0;j<matrix[0].length;j++) {
	   if(firstCol==true) {
		   matrix[0][j] = 0;
	   }
   }
    }
}