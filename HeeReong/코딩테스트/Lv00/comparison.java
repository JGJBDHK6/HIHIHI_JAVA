package Lv00;
// 두 수의 일치
// 정수 num1과 num2가 매개변수로 주어집니다.
// 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

public class comparison {
    public int solution(int num1, int num2) {
        if(num1 == num2)
            return 1;
        else
            return -1;
    }

    // return (num1==num2) ? 1 : -1;
}
