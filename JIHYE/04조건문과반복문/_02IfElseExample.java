package _04조건문과반복문;

public class _02IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A등급입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B등급입니다.");
        }
    }
}
