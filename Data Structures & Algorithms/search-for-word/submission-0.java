class Solution {
    public boolean exist(char[][] board, String word) {
        dfs(board,word);
        return resdfs;
    }

    boolean resdfs = false;
    public void dfsOnDir(char[][] grid, String word, int matchIndex,int r, int c){
        if(matchIndex == word.length()){
            resdfs = true;
            return ;
        }
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != word.charAt(matchIndex)){
            return ;    
        }
        char temp = grid[r][c];
        grid[r][c] = '#';
        dfsOnDir(grid, word, matchIndex + 1, r, c + 1);
        dfsOnDir(grid, word, matchIndex + 1, r - 1, c);
        dfsOnDir(grid, word, matchIndex + 1, r, c - 1);
        dfsOnDir(grid, word, matchIndex + 1, r + 1, c);

        grid[r][c] = temp;
    }

    public  void dfs(char[][] grid, String word){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == word.charAt(0)){
                    dfsOnDir(grid, word, 0, i, j);
                }
            }
        }   
    }

}
