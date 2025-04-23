package project;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Calculator calculator = new Calculator();
        calculator.calculation();

        // 게터 활용
        ArrayList<String> getter = calculator.getResult();
        System.out.println("게터 결과값 : " + getter);

        // 세터 활용
        // 세터로 설정할 ArrayList 만들기 (세터1)
        ArrayList<String> setterSetting =  new ArrayList<>();
        setterSetting.add("123");
        setterSetting.add("995");
        setterSetting.add("123");

        calculator.setResultAll(setterSetting);
        System.out.println("세터 결과값 : " + calculator.getResult());

        // 세터로 원하는값 설정해보기 (세터2)
        calculator.setResultPart(0,"753");
        ArrayList<String> AfterSet = calculator.getResult();
        System.out.println("원하는 값 변경후 : " + AfterSet);

        // 첫번째 값 제거하는 메서드 활용
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 값을 삭제하시겠습니까? 삭제하시려면 예를 입력해주세요.");
        System.out.print("입력 확인 : ");
        String confirm = scanner.next();
        if(confirm.equals("예")){
            calculator.remove();
            ArrayList<String> afterRemove = calculator.getResult();
            System.out.println("삭제후 결과값 : " + afterRemove);
        } else {
            System.out.println("삭제되지 않았습니다. 결과값 : " + calculator.getResult());
        }


        
    }

}
