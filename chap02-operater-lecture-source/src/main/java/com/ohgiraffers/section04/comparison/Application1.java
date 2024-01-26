package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args) {

        /* 필기.
         * 비교 연산자
         * 비교 연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
         * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항 연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
         * */

        /*필기.
         * 비교연산자의 종류
         * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false 를 반환
         * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
         * '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
         * '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
         * '<' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
         * '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
         * */

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("========================= 정수값 비교===================");
        System.out.println("inum1 과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1 과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1 이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1 이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1 이 inum2보다 작은지 비교 : " + (inum1 < inum2));

        /* 문자값 비교 */
        char ch1 = 'a';  // 'a' = 97
        char ch2 = 'A'; // 'A' = 65

        System.out.println("======================== 문자값 비교=======================");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));

        /* 논리값과 문자열은 '==' , '!=' 만 비교 가능하다*/
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 과 bool2 가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1 과 bool2 가 같지 않은지 비교 : " + (bool1 != bool2));
//        System.out.println("bool1 이 bool2 보다 큰지 비교 : " + (bool1 > bool2));  // 에러 발생

        String str1 = "java";
        String str2 = "java";

        System.out.println("str과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str과 str2가 같지 않은지 비교 : " + (str1 != str2));
//        System.out.println("str이 str2보다 작은지 비교 : " + (str1 < str2)); // 에러 발생


        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result의 값은 : " + result);


    }
}
