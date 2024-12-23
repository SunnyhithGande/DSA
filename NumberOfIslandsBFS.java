import java.util.Queue;
import java.util.LinkedList;

public class NumberOfIslandsBFS 
{
    private static void bfs(char[][] grid, int row, int col) 
    {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = '0';
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) 
        {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int[] dir : directions) 
            {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') 
                {
                    queue.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }

    public static int numIslands(char[][] grid) 
    {
        if (grid == null || grid.length == 0) return 0;

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (grid[i][j] == '1') 
                { 
                    numIslands++;
                    bfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }
    public static void main(String[] args) 
    {
        char[][] grid = 
        {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands: " + numIslands(grid));
    }
}
