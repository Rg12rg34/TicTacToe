package com.BridgeLabz;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        System.out.println("Welcome to the tic tac toe");
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);
        System.out.println("Enter the letter X or o");
        letter = input.next().charAt(0);
        System.out.println("Enter the position between 1 to 9");
        int pos = input.nextInt();
        placePiece(gameBoard,pos,letter);
    }

    //method to show the board to the player so player can move properly
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void placePiece(char[][] gameBoard,int pos, char letter){
        switch (pos){
            case 1: gameBoard[0][0]= letter;
                break;
            case 2: gameBoard[0][2] = letter;
                break;
            case 3: gameBoard[0][4] = letter;
                break;
            case 4: gameBoard[2][0] = letter;
                break;
            case 5: gameBoard[2][2] = letter;
                break;
            case 6: gameBoard[2][4] = letter;
                break;
            case 7: gameBoard[4][0] = letter;
                break;
            case 8: gameBoard[4][2] = letter;
                break;
            case 9: gameBoard[4][4] = letter;
                break;
        }
        printGameBoard(gameBoard);
    }
}
