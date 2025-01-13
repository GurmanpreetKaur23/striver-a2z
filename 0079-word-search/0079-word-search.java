class Solution {
    public boolean search(char[][] board , String word , int row , int col , int idx , int m , int n) {
        if(idx==word.length()) return true;
        // boundaries
        if(row<0 || col<0 || row==m || col==n || board[row][col] != word.charAt(idx) || board[row][col]=='!') return false ;

        // prevent reuse 
        char c = board[row][col] ;
        board[row][col] = '!' ;
        boolean top = search(board , word , row-1 , col , idx+1 , m , n) ;
        boolean bottom = search(board , word , row+1 , col , idx+1 , m , n) ;
        boolean left = search(board , word , row , col-1 , idx+1 , m , n) ;
        boolean right = search(board , word , row , col+1 , idx+1 , m , n) ;

        board[row][col] = c ;
        return top || bottom || right || left ;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length ; //rows
        int n = board[0].length ; // cols

        int idx = 0 ;
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(word.charAt(idx) == board[i][j]) {
                    if(search(board , word , i , j , idx , m , n)) {
                        return true ;
                    }
                    
                    }
            }
        }
        return false ;
    }
}