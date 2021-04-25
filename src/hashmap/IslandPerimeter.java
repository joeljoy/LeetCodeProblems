package hashmap;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    //chek vertical
                    if (i == 0) {
                        perimeter++;
                    } else if (grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    if (i == grid.length - 1) {
                        perimeter++;
                    } else if (grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    //check horizontal
                    if (j == 0) {
                        perimeter++;
                    } else if (grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    if (j == grid[i].length - 1) {
                        perimeter++;
                    } else if (grid[i][j + 1] == 0) {
                        perimeter++;
                    }

                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        IslandPerimeter perimeter = new IslandPerimeter();
        int[][] grid1 = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int[][] grid2 = {
                {1}
        };
        int[][] grid3 = {
                {1, 0}
        };
        System.out.println(perimeter.islandPerimeter(grid1));
        System.out.println(perimeter.islandPerimeter(grid2));
        System.out.println(perimeter.islandPerimeter(grid3));
    }
}
