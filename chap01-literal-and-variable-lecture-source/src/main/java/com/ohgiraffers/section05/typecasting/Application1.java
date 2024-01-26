package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /*필기.
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인경우 실행 가능
        * - 즉 , 같은 데이터 타입 끼리만 연산을 수행 할수 있다.
        * */

        /*필기.
        * 형변환의 종류와 규칙
        * 1. 자동 형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행 해주는 타입 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        *   1-2. 정수는 실수로 자동 형변환된다.
        *   1-3. 문자형은 int 형으로 자동 형변환된다.
        *   1-4. 논리형은 형변환 규칙에서 제외된다.
        * 2. 강제형변환 (명시적 형변환) ; 형변환 (cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *   2-1 . 자동현변환이 적용되지 않는경우 강제 형변환이 필요하다.
        * */

        /*필기. 점점더 큰자료형으로 데이터를 옮겨도 문제없이 형변환 처리 된다.*/
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;

//        int result1 = num + num2; // 자동으로 큰쪽자료형인 long으로 변환 후 계산 하기 때문에 int 에 담을 수 없다.
        long result1 = num1 + num2;
        // int + long 은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동으로 수행후 연산한다

        System.out.println("result1 : " + result1);

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;
        System.out.println("result2 : " + result2);

        /*필기.
        * 정수를 실수로 변경할때 소수점 자리수가 없어도 실수 형태로 표현이 가능하다.
        * 이때 데이터 손실이 없기 때문에 자동형변환이 가능하다.
        * */

        long eight = 8;
        float four = eight;

        System.out.println("float : " + four);

        float result3 = eight + four;
        System.out.println("result2 : " + result3);

        /*문자형은 int 형으로 자동변환 된다.*/
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println("charNumber : " + charNumber);

        /* 논리형은 형변환 규칙에서 제외된다.
        * 어느 자료형이든 boolean 을 형변환 해서 담을 수 없다.*/
        boolean isTrue = true;
//        byte b = isTrue;
//        int i = isTrue;
//        char c = isTrue;
//        double d = isTrue;
    }
}
