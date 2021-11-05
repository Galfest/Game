package ru.Galfest;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random rand = new Random();
    private static char[][] field;
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char DOT_EMPTY = '.';
    private static char DOT_X = 'X';
    private static char DOT_0 = '0';
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLenht;

    public static void main(String[] args){
        fieldInit(3,3);
        printField();

    }

    private static void fieldInit(int sizeY, int sizeX){
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;

        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField(){
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }

        for ()
    }



}
