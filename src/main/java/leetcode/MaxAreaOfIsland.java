package leetcode;

/*
695. Max Area of Island

## 문제
격자가 array[][]가 주어 졌을때 최대 섬의 개수를 찾아라.
섬이란 4면(위, 아래, 왼쪽, 오른쪽)이 0일때

## 풀이
격자를 하나씩 체크한다.
1 이 발견되면 dfs 4면은 모두 체크한다.
체크하면서 숫자를 counting 한다.
4면을 모두 저한 합을 리턴한다.

최종 리턴한 숫자의 max값을 비교하여 갖는다.

* */


public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        int maxCount  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    maxCount = Math.max(maxCount, dfs(grid, i, j));
                }
            }
        }
        return maxCount;
    }

    private int dfs(int[][] grid, int x, int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        return 1 + dfs(grid, x + 1, y) + dfs(grid, x - 1, y) + dfs(grid, x, y + 1) + dfs(grid, x, y - 1);
    }

}
