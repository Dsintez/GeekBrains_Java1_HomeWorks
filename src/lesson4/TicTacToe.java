package lesson4;

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
            if (checkWin(DOT_X, "Пользователь победил!")) {
                break;
            }
            if (isMapFull()) {
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O, "Компьютер победил!")) {
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

    private static boolean checkWin(char symbol, String message) {
        for (int i = 0; i < SIZE - DOTS_TO_WIN; i++) {
            for (int j = i; j < DOTS_TO_WIN + i; j++) {
                if (map[i][j] == symbol && map[i][j] == symbol && map[i][j] == symbol) { //TODO
                    System.out.println(message);
                    return true;
                }
            }

        }
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            System.out.println(message);
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            System.out.println(message);
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            System.out.println(message);
            return true;
        }

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            System.out.println(message);
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            System.out.println(message);
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            System.out.println(message);
            return true;
        }

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            System.out.println(message);
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            System.out.println(message);
            return true;
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
            } catch (NumberFormatException e){
                System.out.println("Введите числа от 1 до 3");
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
        if (colNumber < 1 || rowNumber > SIZE)
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
