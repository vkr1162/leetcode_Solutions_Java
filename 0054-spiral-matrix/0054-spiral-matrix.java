class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> list = new ArrayList<Integer>();
	
	int colBegin = 0;
	int rowBegin = 0;
	int colEnd = matrix[0].length-1;
	int rowEnd = matrix.length-1;
	while(rowBegin<=rowEnd && colBegin<=colEnd ) {
		//traverse right
		for(int i=colBegin;i<=colEnd;i++) {
			list.add(matrix[rowBegin][i]);
		}
		rowBegin++;
		//traverse bottom
		for(int i=rowBegin;i<=rowEnd;i++) {
			list.add(matrix[i][colEnd]);
		}
		colEnd--;
		//traverse left
		if(rowBegin<=rowEnd) {
		for(int i=colEnd;i>=colBegin;i--) {
			list.add(matrix[rowEnd][i]);
		}
		}
        rowEnd--;
		//traverse up
		if(colBegin<=colEnd) {
		for(int i=rowEnd;i>=rowBegin;i--) {
			list.add(matrix[i][colBegin]);
		}
		}
        colBegin++;
	}
		
		
	return list;
    }
}