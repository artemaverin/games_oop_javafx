package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
                if (board[i][i] != 0 && (checkRow(board, i) || checkColumn(board, i))) {
                    rsl = true;
                    break;
                }
        }
        return rsl;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean res = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean res = true;
        for (int j = 0; j < board[column].length; j++) {
            if (board[j][column] == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

}
