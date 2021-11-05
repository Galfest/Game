package ru.Galfest;

import java.util.Random;
import java.util.Scanner;

class Game {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLength;
    private static char[][] field;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_0 = '0';
    private static final char DOT_X = 'X';


    public static void main(String[] args) {
        initField(3, 3);
        printField();
        while (true) {
            humanTurn();
            if (chekWin(DOT_X))
                System.out.println("Human WIN!!!");
            printField();
            AiTurn();
            if (chekWin(DOT_0))
            System.out.println("Ai WIN!!!");
            printField();
        }
    }

    private static void AiTurn(){
        int x, y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[x][y] = DOT_0;
    }

    private static void humanTurn(){
        int x;
        int y;
        do {
            System.out.print("Please, enter coordinates of your turn x and y split by whitespace>>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_X;
    }

    private static boolean chekWin(char dot){
        //hor
        if (field[0][0] == dot && field[0][1] == dot&& field[0][2] == dot);
        return  true;
        if (field[1][0] == dot && field[1][1] == dot&& field[1][2] == dot);
        return  true;
        if (field[2][0] == dot && field[2][1] == dot&& field[2][2] == dot);
        return  true;
        //ver
        if (field[0][0] == dot && field[1][0] == dot&& field[2][0] == dot);
        return  true;
        if (field[0][1] == dot && field[1][1] == dot&& field[2][1] == dot);
        return  true;
        if (field[0][2] == dot && field[1][2] == dot&& field[2][2] == dot);
        return  true;
        //diag
        if (field[0][0] == dot && field[1][1] == dot&& field[2][2] == dot);
        return  true;
        if (field[0][2] == dot && field[1][1] == dot&& field[2][0] == dot);
        return  true;
        return false;
    }

    private static boolean chekDraw(){
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("This is DRAW!!!");
        return true;
    }

    private static boolean isCellEmpty(int y, int x){
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int y, int x){
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static void initField(int sizeY, int sizeX) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }

    }

    private static void printField() {
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }
//    }
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 +1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
        System.out.print("_");
    }
        System.out.println();
}
}