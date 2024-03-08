package array;

import java.util.*;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // Random하게 중복되지 않은 1~100 까지의 수를 발생시킨다.
        // 각 열에 최대값의 합과 최소값의 합을 출력하시오.
        int arr[][] = new int[5][5];
        int num = 0;
        int max_value = 0;
        int min_value = 102;
        boolean[] visited = new boolean[101];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = r.nextInt(100) + 1;
                if (!visited[num - 1]) {
                    visited[num - 1] = true;
                    arr[i][j] = num;
                    max_value = Math.max(num, max_value);
                    min_value = Math.min(num, min_value);
                } else {
                    j--;
                }
            }
        }
        System.out.println(max_value);
        System.out.println(min_value);
    }
}