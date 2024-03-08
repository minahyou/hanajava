package loop;

public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("----------------");
        //while문으로 변경
        int j = 0;
        int sum2 =0;
        while(j<=10){
            sum2 += j;
            j++;
        }
        System.out.println(sum2);
        System.out.println("------------");
    }
}
