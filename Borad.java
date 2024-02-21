public class Borad {
    private String word;
    private String[][] board;
    private int length, maxatts;
    private int attindex;

    public Borad() {
        word = "";
        length = 5;
        maxatts = 6;
        attindex = 0;
        board = new String[maxatts][length];
    }

    public Borad(String w) {
        word = w;
        length = 5;
        maxatts = 6;
        attindex = 0;
        board = new String[maxatts][length];

        for (int i = 0; i < maxatts; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = "-";
            }
        }
    }

    //////////////////////////////

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public int getAttindex() {
        return attindex;
    }

    public void setAttindex(int attindex) {
        this.attindex = attindex;
    }

    public int getLength() {
        return length;
    }

    public int getMaxatts() {
        return maxatts;
    }

    public String getChar(int att, int index) {
        return board[att - 1][index - 1];
    }
}