package bingo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.next());

            int[][] bingo = new int[N][N];

            for(int i=0; i<N; ++i) {
                for(int k=0; k<N; ++k) {
                    bingo[i][k] = Integer.parseInt(sc.next());
                }
            }

            int res = 0;

            // 行のビンゴを判定
            for(int i=0; i<N; ++i) {
                for(int k=0; k<N; ++k) {

                    // 1じゃなければ次の行へ
                    if(1 != bingo[i][k]) break;

                    // 一番右の列まで1ならresに+1
                    if(N-1 == k) res++;
                }
            }

            // 列のビンゴを判定
            for(int k=0; k<N; ++k) {
                for(int i=0; i<N; ++i) {
                    if(1 != bingo[i][k]) break;
                    if(N-1 == i) res++;
                }
            }

            // 左上から右下の斜めのビンゴを判定
            for(int l=0; l<N; ++l) {
                if(1 != bingo[l][l]) break;
                if(N-1 == l) res++;
            }

            // 右上から左下の斜めのビンゴを判定
            for(int l=0; l<N; ++l) {
                if(1 != bingo[l][N-l-1]) break;
                if(N-1 == l) res++;
            }

            // ビンゴ数を出力
            System.out.println(res);
        }
    }
}