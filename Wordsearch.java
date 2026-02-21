/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.*/
import java.util.*;
class Wordsearch{
  public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;
        boolean[][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(backtrack(i,j,0,board,word,visited)) return true;
            }
        }
        return false;
    }
    public boolean backtrack(int row,int col,int index,char[][] board,String word, boolean[][]visited){
        if(index==word.length()) return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length) return false;
        if(board[row][col]!=word.charAt(index)) return false;
        if(visited[row][col]) return false;
        visited[row][col]=true;
        boolean found=backtrack(row+1,col,index+1,board,word,visited) ||
        backtrack(row-1,col,index+1,board,word,visited) ||
        backtrack(row,col+1,index+1,board,word,visited) ||
        backtrack(row,col-1,index+1,board,word,visited);
        visited[row][col]=false;;
        return found;
    }
}
