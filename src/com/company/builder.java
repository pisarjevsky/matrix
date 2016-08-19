package com.company;

/**
 * Created by Admin on 19.08.2016.
 */
public class builder {
    int width = 7;
    int height = 7;
    int[][] arr = new int[width][height];
    public void builder() {
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (i == (height - j - 1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("\r");
        }
    }
}
