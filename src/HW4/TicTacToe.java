package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TicTacToe {
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char DOTS_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static char[][] map;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
        System.out.println("Игра окончена!");
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Пользователь победил!");
                break;
            }
            if (isMapFull()) {
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOTS_EMPTY)
                    return false;
            }
        }
        System.out.println("Ничья!");
        return true;
    }

    private static boolean checkWin(char symbol) {
        int smollBoxLine = SIZE - DOTS_TO_WIN;
        int smollBoxColumn = SIZE - DOTS_TO_WIN;
        for (int line = 0; line <= smollBoxLine; line++) {
            for (int column = 0; column <= smollBoxColumn; column++) {
                if (checkSmallBox(symbol, line, column)) return true;
            }
        }
        return false;
    }

    private static boolean checkSmallBox(char symbol, int offsetLine, int offsetColumn) {
        int horizont = 0;
        int vertikal = 0;
        int dioganal1 = 0;
        int dioganal2 = 0;
        for (int i = offsetLine; i < DOTS_TO_WIN + offsetLine; i++) {
            horizont = 0;
            vertikal = 0;
            for (int j = offsetColumn; j < DOTS_TO_WIN + offsetColumn; j++) {
                if (i - offsetLine == j - offsetColumn && map[i][j] == symbol) {
                    dioganal1++;
                }
                if ((j- offsetLine +1 == DOTS_TO_WIN - (i - offsetColumn)) && (map[i][j] == symbol)) {
                    dioganal2++;
                }
                if (map[i][j] == symbol) {
                    horizont++;
                }
                if (map[j][i] == symbol) {
                    vertikal++;
                }
            }
            if (dioganal1 == DOTS_TO_WIN || dioganal2 == DOTS_TO_WIN || horizont == DOTS_TO_WIN || vertikal == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static void humanTurn() {
        int rowNumber = 0, colNumber = 0;
        do {
            System.out.println("Ход игрока. Введите номер строки и столбца");
            try {
                System.out.print("Строка = ");
                rowNumber = Integer.parseInt(reader.readLine());
                System.out.print("Колонка = ");
                colNumber = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Введите числа от 1 до " + SIZE);
            }
        } while (!isCellValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        int rowNumber = 0, colNumber = 0;
        System.out.println("Ходит компьютер.");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE)
            return false;
        if (colNumber < 1 || colNumber > SIZE)
            return false;
        return map[rowNumber - 1][colNumber - 1] == DOTS_EMPTY;
    }

    private static void printMap() {
        printMapHeader();
        printMapRose();
    }

    private static void printMapRose() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + " ");
    }

    private static void printMapHeader() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOTS_EMPTY;
            }
        }
    }
}
