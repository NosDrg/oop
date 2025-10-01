public class CharGrid {
    private char[][] map;

    public CharGrid(char[][] map) {
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



    public static void main(String[] args) {
        char[][] data = {
                {'a', 'B', ' '},
                {'C', 'a', 'a'},
                {' ', 'D', 'E'}
        };
        CharGrid cg = new CharGrid(data);


        System.out.println(cg);
        System.out.println(cg.countChar('a'));
        cg.setChar(2, 2, 'C');
        System.out.println(cg.countChar('C'));

    }
}
