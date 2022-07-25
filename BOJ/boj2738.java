package BOJ;

import java.util.*;

public class boj2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for( int i = 0; i < 2; i++ ) {
            for( int j = 0; j < N; j++ ) {
                for( int k = 0; k < M; k++ ) {
                    arr[j][k] = arr[j][k] + sc.nextInt();
                }
            }
        }

        for( int i = 0; i < N; i++ ) {
            for( int j = 0; j < M; j++ ) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}