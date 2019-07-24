public class LightBoard {
    /**
     * The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;

    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        /* to be implemented in part (a) */
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                int m = (int) (Math.random() * 10 + 1);
                lights[r][c] = m <= 4;
            }
        }
    }

    /**
     * Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col) {
        /* to be implemented in part (b) */
        boolean state = lights[row][col];
        int numOn = 0;

        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col])
                numOn++;
        }

        if (state && numOn % 2 == 0)
            return false;

        if (!state && numOn % 3 == 0)
            return true;

        return state;
    }

    public LightBoard() {
        /* Just for testing */
        lights = new boolean[7][5];
        lights[0][0] = true;
        lights[0][1] = true;
        lights[0][2] = false;
        lights[0][3] = true;
        lights[0][4] = true;
        lights[1][0] = true;
        lights[1][1] = false;
        lights[1][2] = false;
        lights[1][3] = true;
        lights[1][4] = false;
        lights[2][0] = false;
        lights[2][1] = false;
        lights[2][2] = true;
        lights[2][3] = true;
        lights[2][4] = true;
        lights[3][0] = true;
        lights[3][1] = false;
        lights[3][2] = false;
        lights[3][3] = false;
        lights[3][4] = true;
        lights[4][0] = true;
        lights[4][1] = false;
        lights[4][2] = false;
        lights[4][3] = false;
        lights[4][4] = true;
        lights[5][0] = true;
        lights[5][1] = true;
        lights[5][2] = false;
        lights[5][3] = true;
        lights[5][4] = true;
        lights[6][0] = false;
        lights[6][1] = false;
        lights[6][2] = false;
        lights[6][3] = false;
        lights[6][4] = false;
    }

    // There may be additional instance variables, constructors, and methods not shown.
}
