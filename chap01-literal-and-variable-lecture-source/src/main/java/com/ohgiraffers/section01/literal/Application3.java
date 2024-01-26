package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {


        System.out.println("======================== 두개의 문자열 합치기 ==================");
        System.out.println(9 + 9);      //18
        System.out.println("9" + 9);    //99
        System.out.println(9 + "9");    //99
        System.out.println("9" + "9");

        System.out.println("============ 세개의 문자욜 합치기=======");
        System.out.println(9 + 9 + "9"); //189  연산방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9); //999
        System.out.println("9" + 9 + 9);    //999

        System.out.println("9" + (9 + 9));    //918

        System.out.println("========== 10과 20의 사칙연산 결과=========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("================== 10 과 20의 사칙연산 결과 보기좋게 출력)==============");

        System.out.println("10 과 20의 합 : " + (10 + 20));
        //주의 사항 괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 차 : " + (10 - 20));
        // 문자열은 마이너스 연산이 불가하기에 앞에서 생성된 문자에 마이너스 연산 불가

        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20을 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20을 나누기한 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");
        // 문자열 순서를 이해해야 나중에 코딩시에 편하다
        // + 연산이 굉장히 많음 헷갈림주의

        System.out.println();
    }
}
