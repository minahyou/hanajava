package array;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random r = new Random();
//        int num = r.nextInt(10) + 1;
//        System.out.println(num);
        // int형 배열, 사이즈 10개
        // 배열에 1~100까지의 숫자를 Random하게 넣고 단, 중복되지 않는 숫자를 입력한다.
        // 합과 평균을 구하시오
        int[] arr = new int[10];
        int sum = 0;
        int mean = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = r.nextInt(100) + 1;
            while (true) {
                for (int a : arr) {
                    if (num == a) {
                        num = r.nextInt(100) + 1;
                        break;
                    }
                }
                arr[i] = num;
                break;
            }
        }

        for (int b : arr) {
            sum += b;
        }
        mean = sum / arr.length;
        System.out.println(sum);
        System.out.println(mean);
    }
}
