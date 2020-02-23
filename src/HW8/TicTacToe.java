package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TicTacToe {
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOTS_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static char[][] map;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Random random = new Random();

    public TicTacToe() {
        initMap();
    }

    public boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOTS_EMPTY)
                    return false;
            }
        }
        //System.out.println("Ничья!");
        return true;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE - DOTS_TO_WIN; i++) {
            for (int j = i; j < DOTS_TO_WIN + i; j++) {
                if (map[i][j] == symbol && map[i][j] == symbol && map[i][j] == symbol) {
                    return true;
                }
            }

        }
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public void humanTurn(int rowNumber, int colNumber) {
        map[rowNumber][colNumber] = DOT_X;
    }

    public String aiTurn() {
        int rowNumber = 0, colNumber = 0;
        do {
            rowNumber = random.nextInt(SIZE);
            colNumber = random.nextInt(SIZE);
        } while (!isCellValid(rowNumber, colNumber));
        String motion = "" + rowNumber + colNumber;
        map[rowNumber][colNumber] = DOT_O;
        return motion;
    }

    public boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 0 || rowNumber >= SIZE)
            return false;
        if (colNumber < 0 || rowNumber >= SIZE)
            return false;
        return map[rowNumber][colNumber] == DOTS_EMPTY;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOTS_EMPTY;
            }
        }
    }

    public static char[][] getMap() {
        return map;
    }
}
