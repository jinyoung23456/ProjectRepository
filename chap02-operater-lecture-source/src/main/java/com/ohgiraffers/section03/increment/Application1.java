package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /*필기.
         * 증감연산자
         * 피연산자의 앞 or 뒤에 사용이 가능하다.
         * '++' : 1 증가의 의미
         * '--' : 1 감소의 의미
         * */

        int num = 20;
        System.out.println("num : " + num);

        num++;      // 1 증가
        System.out.println("num : " + num);

        ++num;      // 1 증가
        System.out.println("num : " + num);

        num--;      // 1 감소
        System.out.println("num : " + num);

        --num;      // 1 감소
        System.out.println("num : " + num);

        /* 주의 사항.
        * 증감연산자는 다른 연산자와 함께 사용할때 의미가 달라진다는 것이다.
        * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
        * 'var++' : 다른 연산을 먼저 진행하고 난뒤 마지막에 피연산자의 값을 1증가시킴
        * '++var' : 피연산자의 값을 먼저 1을 증가시킨후 다른 연산을 먼저 진행함
        * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
        * '--var' : 피연산자의 값을 먼저 1을 감소 시킨후 다른 연산을 진행함
        * */


        System.out.println("=================================================");
        int firstNum = 20;


        int result1 = firstNum++ *3; // 다른 연산을 먼저 진행하고 마지막에 firstNum++가 결과에 1을 증가 시킴


        System.out.println("result1 : " + result1); //다른 자료 찾아보기 #######
        System.out.println("firstNum : " + firstNum);
        System.out.println("firstNum : " + (firstNum + firstNum));

        System.out.println("=================================================");

        int secondNum = 20;
        int result2 = ++secondNum * 3; // 증가를 먼저 처리하고 난 뒤 다른 연산을 함

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;

        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);




    }
}
