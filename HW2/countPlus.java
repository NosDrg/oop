public class countPlus {
    private char[][] map;

    public countPlus(char[][] map) {
        this.map = new char[map.length][];
        for (int i = 0; i < map.length; i++) {
            this.map[i] = map[i].clone();
        }
    }

    public int numR() {
        return map.length;
    }

    public int numC() {
        return map[0].length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numR(); i++) {
            for (int j = 0; j < numC(); j++) {
                stringBuilder.append(map[i][j]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }



    public int countPlus() {
        int count = 0;
        for (int i = 0; i < numR(); i++) {
            for (int j = 0; j < numC(); j++) {
                if (isPlus(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPlus(int row, int col) {
        char ch = map[row][col];

        int up = branchLength(row, col, -1, 0, ch);
        int down = branchLength(row, col, 1, 0, ch);
        int left = branchLength(row, col, 0, -1, ch);
        int right = branchLength(row, col, 0, 1, ch);

        if (up >= 2 && down >= 2 && left >= 2 && right >= 2) {
            return (up == down && down == left && left == right);
        }
        return false;
    }

    private int branchLength(int row, int col, int dr, int dc, char ch) {
        int length = 1;
        int r = row + dr, c = col + dc;

        while (r >= 0 && r < numR() && c >= 0 && c < numC()
                && map[r][c] == ch) {
            length++;
            r += dr;
            c += dc;
        }
        return length;
    }


    public static void main(String[] args) {
        char[][] data = {
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', 'x', ' '},
                {'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
                {' ', ' ', 'p', ' ', ' ', 'y', ' ', 'x', ' '},
                {' ', ' ', 'p', ' ', ' ', 'y', 'y', 'y', ' '},
                {'z', 'z', 'z', 'z', 'z', 'y', 'z', 'z', 'z'},
                {' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '},
        };
        countPlus cg = new countPlus(data);

        System.out.println(cg.countPlus());

    }
}
