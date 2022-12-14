package _04조건문과반복문;

public class _06SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6 ) + 1;	// 1부터 시작하는 6개의 정수 중 하나(1~6 중 하나)

        switch(num) {
            case 1 :
                System.out.println("1번이 나왔습니다.");
                break;							
                // 각 case에 break를 걸어주는 이유는 break를 하지 않으면 선택된 수 이후에 해당하는 실행문도 같이 실행되기 때문
            case 2 :
                System.out.println("2번이 나왔습니다.");
                break;
            case 3 :
                System.out.println("3번이 나왔습니다.");
                break;
            case 4 :
                System.out.println("4번이 나왔습니다.");
                break;
            case 5 :
                System.out.println("5번이 나왔습니다.");
                break;
            default :
                System.out.println("1번이 나왔습니다.");
                break;
        }
    }
}
