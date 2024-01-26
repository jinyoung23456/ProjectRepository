package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {

        /*논리 연산자 의종류
         * 1. 논리 연결 연산자 : 두개의 피연산자를 가지는 이항 연산자이며, 두 개의 논리식을 판단하여 참과 거짓을 판단한다.
         *   1-1. &&(논리 AND) 연산자 : 두개의 논리식중 모두 참 일 경우 참을 반환. 하나라도 거짓인경우 거짓을 반환
         *   1-2. ||(논리 OR) 연산자 : 두개의 논리식중 하나라도 참일 경우 참을 반환, 둘다 거짓일 경우 거짓 반환
         * 2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자
         *   1-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참 반환
         *  */


        System.out.println("true && true : " + (true && true));        //true
        System.out.println("true && false : " + (true && false));      //false
        System.out.println("false && true : " + (false && true));      //false
        System.out.println("true && false : " + (false && true));      //false

        System.out.println("true || true : " + (true || true));         //t
        System.out.println("true || false : " + (true || false));       //t
        System.out.println("false || true  : " + (false || true));     //t
        System.out.println("false || false  : " + (false || false));   //f

        System.out.println("true 의 NOT 연산 : " + (!true));             //f
        System.out.println("false 의 NOT 연산 : " + (!false));             //t


        /*논리식에 논리 연산자 활용*/
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지? : " + (a < b && c < d)); //true
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지? : " + (a < b && c > d));   //false
        System.out.println("a > b && c < d : " + (a > b && c < d));                  //false
        System.out.println("a > b && c > d : " + (a > b && c > d));                  //false

        System.out.println("a < b || c < d : " + ( a < b || c < d));    //true
        System.out.println("a < b || c > d : " + ( a < b || c > d));    //true
        System.out.println("a > b || c < d : " + ( a > b || c < d));    //true
        System.out.println("a > b || c > d : " + ( a > b || c > d));    //false

        System.out.println("");


    }
}
