package array;

public class Array1 {
    public static void main(String[] args) {
        int a [] ;
        a = new int[5];
        // a = {1,2,3}; -> 에러
        a[0] = 1;
        a[1] = 2;
        a[3] = 10; //default는 0
        // a = new int[]; 사이즈 설정 필수
        System.out.println(a[1]);


        int [] b ;
        b = new int[]{1,2,3,4,5};

        int c [] = {1,2,3,4,5};

        String str [] = {"A", "B", "C"};
    }
}
