package com.BridgeLabz;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Welcome to the tic tac toe");
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);
    }
    public static void printGameBoard(char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }

}