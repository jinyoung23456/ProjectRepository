package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {

        /* 삼항 연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * (조건식)? = 참일 때 사용할 값 : 거짓일때 사용할 값
        *                  true              false
        * */


        /* 삼항 연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0)? "양수다!" : "양수 아니다!!";
        String result2 = (num2 > 0)? "양수야!" : "양수 아니야!!";


        System.out.println("num1은 " + result1);
        System.out.println("num2는 " + result2);


        /* 삼항 연산자 중첩 사용 */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수야!" : (num3 == 0)? "0이다" : "음수야!!";
        String result4 = (num4 > 0)? "양수야!" : (num4 == 0)? "0이다" : "음수야!!";
        String result5 = (num5 > 0)? "양수야!" : (num5 == 0)? "0이다" : "음수야!!";

        System.out.println("num3 : " + result3);
        System.out.println("num4 : " + result4);
        System.out.println("num5 : " + result5);

    }
}
