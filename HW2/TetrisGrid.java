public class TetrisGrid {
    private boolean[][] grid; // grid[x][y]

    public TetrisGrid(boolean[][] grid) {
        this.grid = new boolean[grid.length][grid[0].length];
        for (int x = 0; x < grid.length; x++) {
            this.grid[x] = grid[x].clone();
        }
    }

    public void clearRows() {
        int indexRow = 0;

        for (int y = 0; y < grid[0].length; y++) {
            if (!isFull(y)) {
                for (int x = 0; x < grid.length; x++) {
                    grid[x][indexRow] = grid[x][y];
                }
                indexRow++;
            }
        }

        for (int y = indexRow; y < grid[0].length; y++) {
            for (int x = 0; x < grid.length; x++) {
                grid[x][y] = false;
            }
        }
    }

    private boolean isFull(int y) {
        for (int x = 0; x < grid.length; x++) {
            if (!grid[x][y]) return false;
        }
        return true;
    }

    public boolean[][] getGrid() {
        return grid;
    }
    public void printGrid() {
        for (int y = grid[0].length-1; y >= 0; y--) {
            for (int x = 0; x < grid.length; x++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        boolean[][] grid = {
                {false, false, true},
                {true,  true,  true},
                {false, true,  true},
                {true, true,  true},
                {true, false, true},
        };
        TetrisGrid tg = new TetrisGrid(grid);

        tg.printGrid();
        tg.clearRows();

        tg.printGrid();
    }
}
