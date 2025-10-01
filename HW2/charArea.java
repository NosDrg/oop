public class charArea {
    private char[][] map;

    public charArea(char[][] map) {
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

    public char getChar(int row, int col) {
        return map[row][col];
    }

    public void setChar(int row, int col, char c) {
        map[row][col] = c;
    }

    public int countChar(char c) {
        int count = 0;
        for (int i = 0; i < numR(); i++) {
            for (int j = 0; j < numC(); j++) {
                if (map[i][j] == c) {
                    count++;
                }
            }
        }
        return count;
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

    public int charArea(char ch) {
        int minRow = numR(), maxRow = -1;
        int minCol = numC(), maxCol = -1;

        for (int i = 0; i < numR(); i++) {
            for (int j = 0; j < numC(); j++) {
                if (map[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }

        if (maxRow == -1) return 0;

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        return height * width;
    }




    public static void main(String[] args) {
        char[][] data = {
                {'a', 'B', ' '},
                {'C', 'a', 'a'},
                {' ', 'D', 'E'}
        };
        charArea cg = new charArea(data);


        System.out.println(cg.charArea('a'));
        System.out.println(cg.charArea('C'));
        System.out.println(cg.charArea('x'));
        System.out.println(cg.charArea('z'));

    }
}
