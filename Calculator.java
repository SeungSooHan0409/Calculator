package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {// 속성
    private ArrayList<String> colletionArchive = new ArrayList<>();


    // 생성자


    // 기능

    Scanner scanner = new Scanner(System.in);

    String resultValue = "";
    int trigger = 0; // 트리거가 1 이되면 계산이 종료됩니다.
    void calculation() {
        // for 문 while 문으로 변경
        while (trigger == 0) {

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
                resultValue = String.valueOf(firstNumber) + "+" + String.valueOf(secondNumber) + "=" + String.valueOf((firstNumber + secondNumber));
                System.out.println("더하기 연산 : " + resultValue);
            } else if (calSign.equals("-")) {
                resultValue = String.valueOf(firstNumber) + "-" + String.valueOf(secondNumber) + "=" +  String.valueOf((firstNumber - secondNumber));
                System.out.println("빼기 연산 : " + resultValue);
            } else if (calSign.equals("*")) {
                resultValue = String.valueOf(firstNumber) + "*" + String.valueOf(secondNumber) + "=" +  String.valueOf((firstNumber * secondNumber));
                System.out.println("곱셈 연산 : " + resultValue);
            } else if (calSign.equals("/")) {
                String quotient = "";
                String rest = "";
                switch (secondNumber) {
                    case 0:
                        System.out.println("분모는 0이 될 수 없습니다.");
                        break;
                    default:
                        // 몫을 저장하는 변수 quotient
                        quotient = String.valueOf(firstNumber) + "/" + String.valueOf(secondNumber) + "=" +  String.valueOf((firstNumber / secondNumber));
                }
                switch (secondNumber) {
                    case 0:
                        System.out.print("");
                        break;
                    default:
                        // 나머지를 저장하는 변수 rest
                        rest = String.valueOf((firstNumber % secondNumber));
                }
                // 몫과 나머지를 resultValue 에 함께 나타냄.
                resultValue = "몫 : " + quotient + "    나머지 : " + rest;
                System.out.println(resultValue);
            } else {
                resultValue = "잘못된 사칙연산 기호를 입력하였습니다. '+, -, *, /' 중 하나를 입력하세요.";
                System.out.println(resultValue);
            }

            // resultValue 를 속성으로 지정해둔 colletionArchive 에 저장함.
            colletionArchive.add(resultValue);

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


    // 게터 구현
    ArrayList<String> getResult(){
        return this.colletionArchive;
    }

    // 세터 구현1 (값을 통째로 바꿈)
    void setResultAll(ArrayList<String> setArray){
        this.colletionArchive = setArray;
    }

    // 세터 구현2 (지정된 값을 바꿈)
    void setResultPart(int index, String value){
        colletionArchive.set(index,String.valueOf(value));
    }

    // 첫번째 결과값 삭제하는 메서드 구현
    void remove() {
        colletionArchive.remove(0);
    }
}
