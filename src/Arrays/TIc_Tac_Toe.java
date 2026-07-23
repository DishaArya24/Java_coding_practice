package Arrays;

import java.util.Scanner;

public class TIc_Tac_Toe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void printBoard() {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);

            if (i < 2) {
                System.out.println("---|---|---");
            }
        }

        System.out.println();
    }

    public static boolean checkWinner(char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        // Main diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        // Secondary diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char currentPlayer = 'X';

        while (true) {

            printBoard();

            System.out.println("Player " + currentPlayer);

            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            // Validate input
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            // Check if cell is empty
            if (board[row][col] != ' ') {
                System.out.println("Cell already occupied! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " Wins!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Game Draw!");
                break;
            }

            // Switch player
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }

        sc.close();
    }
}