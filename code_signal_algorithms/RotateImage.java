package code_signal_algorithms;

import java.util.Arrays;

/**
 * Codewriting
 *
 * 1000
 *
 * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
 *
 * You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
 *
 * Example
 *
 * For
 *
 * a = [[1, 2, 3],
 *      [4, 5, 6],
 *      [7, 8, 9]]
 * the output should be
 *
 * rotateImage(a) =
 *     [[7, 4, 1],
 *      [8, 5, 2],
 *      [9, 6, 3]]
 */
public class RotateImage {
    public static void main(String[] args) {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotateImage(a)));
    }

    public static int[][] rotateImage(int[][] a) {
        int n = a.length;
        int [][] b = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                b[j][n-i-1] = a[i][j];
            }
        }
        return b;
    }

}
