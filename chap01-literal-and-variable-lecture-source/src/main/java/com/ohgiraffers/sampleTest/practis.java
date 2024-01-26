package com.ohgiraffers.sampleTest;

public class practis {
    public static void main(String[] args) {


        // 자료형 변수명 = 초기화
        int age = 30;
        double nomad = 1.4;

        System.out.println(age + 25);
        System.out.println(nomad + 1);


        int a = 2;

//        a++;

        int b = (a++) + (++a);

        a++;



        // a++ 는 다음 단락에 a 가 사용될때 영향을 미친다.

        System.out.println("================");

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println();

        char uni = 'B';


        System.out.println(uni);




    }
}
