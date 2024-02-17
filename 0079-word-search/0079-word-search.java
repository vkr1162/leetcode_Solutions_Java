class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++) {
    	for(int j=0;j<board[i].length;j++) {
    		if(word.charAt(0)==board[i][j] && wordSearch(i,j,board,word,0)) {
    			return true;
    		}
    	}
    }
	return false;
    }
    private static boolean wordSearch(int i, int j, char[][] board,String word, int position) {
	if(position==word.length()) {
		return true;
	}
	if(i<0 || j <0 || i>= board.length || j>= board[i].length) {
		return false;
	}
        if(word.charAt(position) != board[i][j] ) {
		return false;
	}
	char temp = board[i][j];
	board[i][j] = '*';
	if(wordSearch(i+1, j, board, word, position+1) ||
			wordSearch(i-1, j, board, word, position+1) ||
			wordSearch(i, j+1, board, word, position+1) ||
			wordSearch(i, j-1, board, word, position+1)) {
		return true;
	}
	board[i][j] = temp;
	return false;
}
}

