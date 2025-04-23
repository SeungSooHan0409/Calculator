package project;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int trigger = 0; // 트리거가 1 이되면 계산이 종료됩니다.
        for(; trigger == 0;){
            // 숫자 아니면 에러터지는데 이걸 반복문으로 구현할 방법을 검색해보니
            // exception 쓰면 된다는데 이거 3주차 과정에 있음.
            // 나중에 이거빼고 2단계 구현 완료되며 해볼예정.
            System.out.print("첫번째 양의 정수 : ");
            int firstNumber = scanner.nextInt();
            System.out.println("첫번째 수 : " + firstNumber);

            System.out.print("두번째 양의 정수 : ");
            int secondNumber = scanner.nextInt();
            System.out.println("둘째 수 : " + secondNumber);

            System.out.print("사칙연산 기호 : ");
            // nextLine(); 쓰면 개행문자 때문에 스캐너가 바로 종료됨.
            String calSign = scanner.next();
            System.out.println("기호 : " + calSign);


            if (calSign.equals("+")) {
                System.out.println("더하기 연산 : " + (firstNumber + secondNumber));
            } else if (calSign.equals("-")) {
                System.out.println("빼기 연산 : " + (firstNumber - secondNumber));
            } else if (calSign.equals("*")) {
                System.out.println("곱셈 연산 : " + (firstNumber * secondNumber));
            } else if (calSign.equals("/")) {
                switch (secondNumber) {
                    case 0:
                        System.out.println("분모는 0이 될 수 없습니다.");
                        break;
                    default:
                        System.out.println("나눗셈 연산 몫 : " + (firstNumber / secondNumber));
                }
                switch (secondNumber) {
                    case 0:
                        System.out.print("");
                        break;
                    default:
                        System.out.println("나눗셈 연산 나머지 : " + (firstNumber % secondNumber));
                }
            } else {
                System.out.println("잘못된 사칙연산 기호를 입력하였습니다. '+, -, *, /' 중 하나를 입력하세요.");
            }


            System.out.print("종료하시려면 exit 를 입력하세요 : ");
            String exit = scanner.next();
            System.out.println("입력확인 : " + exit);
            // exit 를 입력하면 trigger 가 1이 됩니다.
            if (exit.equals("exit")) {
                trigger = 1;
            }
        }

        System.out.print("종료되었습니다.");

            }
        }
