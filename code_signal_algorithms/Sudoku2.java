package code_signal_algorithms;

import java.util.HashSet;

/**
 * Codewriting
 * <p>
 * 1000
 * <p>
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.
 * <p>
 * Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.
 * <p>
 * Example
 * <p>
 * For
 * <p>
 * grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
 * ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
 * ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
 * ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
 * ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
 * ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
 * ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
 * ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
 * ['.', '.', '.', '5', '.', '.', '.', '7', '.']]
 * the output should be
 * sudoku2(grid) = true;
 * <p>
 * For
 * <p>
 * grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
 * ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
 * ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
 * ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
 * ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
 * ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
 * ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
 * ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
 * ['.', '2', '.', '.', '3', '.', '.', '.', '.']]
 * the output should be
 * sudoku2(grid) = false.
 * <p>
 * The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.
 */
public class Sudoku2 {
    public static void main(String[] args) {
        char[][] sudoku1 = {
                {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
        };

        char[][] sudoku2 = {
                {'.', '.', '.', '.', '2', '.', '.', '9', '.'},
                {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
                {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
                {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
                {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '.', '3', '.', '.', '.', '.'}
        };

        System.out.println(sudoku2(sudoku2));
    }

    public static boolean sudoku2(char[][] grid) {
        if(!rowsAreOkay(grid)) return false;
        if(!columnsAreOkay(grid)) return false;
        return allSubGridsAreOkay(grid);
    }

    private static boolean rowsAreOkay(char[][] grid) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == '.') continue;
                if (characters.contains(grid[i][j])) return false;
                characters.add(grid[i][j]);
            }
            characters.clear();
        }
        return true;
    }

    private static boolean columnsAreOkay(char[][] grid) {
        HashSet<Character> characters = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (grid[i][j] == '.') continue;
                if (characters.contains(grid[i][j])) return false;
                characters.add(grid[i][j]);
            }
            characters.clear();
        }
        return true;
    }

    static boolean allSubGridsAreOkay(char[][] grid) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!subGridIsOkay(i, j, grid)) return false;
            }
        }
        return true;
    }

    static boolean subGridIsOkay(int row, int column, char[][] grid) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (grid[i][j] == '.') continue;
                if (characters.contains(grid[i][j])) return false;
                characters.add(grid[i][j]);
            }
        }
        return true;
    }
}
