package _04조건문과반복문;

public class _12ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0;					// i 를 for문 선언 전에 작성하여 print 가능
        for(i=1; i<=100; i++) {
            sum += 1;
        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}
