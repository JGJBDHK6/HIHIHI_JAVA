package _04조건문과반복문;

public class _01IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A등급입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B등급입니다.");		// if문 뒤에 중괄호{}가 없어서 14라인은 출력됨. 중괄호 없으면 다음 한줄만 실행.
    }
}

