package week_4_backtracking;

public class RatInMazeProblem {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,0},
                {1,0,1,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        int rows = matrix.length; //4
        int col = matrix[0].length; //4

        boolean[][] visited = new boolean[rows][col];
        visited[0][0] = true;

        ratInAMaze(matrix,visited,0,0,"", rows, col);
    }
    static boolean isDirectionValid(int i, int j, int[][] mat, boolean[][] vis, int n, int m) {
        return i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j];
    }

    //Directions: D->L->R->U
    static void ratInAMaze(int[][] mat, boolean[][] vis, int i, int j, String path, int n, int m) {
        //start position 'i' will be in row & end 'j' will be in col
        //base case
        if (i == n - 1 && j == m - 1) { //bottom right corner reached
            System.out.println(path);
        } else {
            if (isDirectionValid(i + 1, j, mat, vis, n, m)) {
                vis[i + 1][j] = true;
                ratInAMaze(mat, vis, i + 1, j, path + "D", n, m);
                //backtrack
                vis[i + 1][j] = false;
            }

            if (isDirectionValid(i, j - 1, mat, vis, n, m)) {
                vis[i][j - 1] = true;
                ratInAMaze(mat, vis, i, j - 1, path + "L", n, m);
                vis[i][j - 1] = false;
            }

            if (isDirectionValid(i, j + 1, mat, vis, n, m)) {
                vis[i][j + 1] = true;
                ratInAMaze(mat, vis, i, j + 1, path + "R", n, m);
                vis[i][j + 1] = false;
            }

            if (isDirectionValid(i - 1, j, mat, vis, n, m)) {
                vis[i - 1][j] = true;
                ratInAMaze(mat, vis, i - 1, j, path + "U", n, m);
                vis[i - 1][j] = false;
            }
        }
    }
}
