package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        System.out.println(123);
        System.out.println(1.23);

        System.out.println('a'); // <-한줄 주석       문자 형태의 값은  홑따옴표 ('=single cotaion)
//        System.out.println('ab');  //두개 이상은 문자로 취급되지 않음
//        System.out.println(''); // 아무 문자도 기록되지 않은 경우 에러 발생
            System.out.println('1');  // 숫자값이라도 홑따옴표 감싸질 경우 문자 1 이라고 판단

            System.out.println("안녕하세요"); // 문자열은 문자 여러개가 나열된 형태를 말하며 쌍따옴표 (" ) 으로 감싸줘야 한다
            System.out.println("123"); // 정수 이지만 쌍옴표로 감 싸져 있기 때문에 문자열로 판단
            System.out.println(""); // 아무값도 없는 빈 쌍따옴표도 문자 열로 취급한다.
            System.out.println("a"); //  한개의 문자도 쌍따옴표로 감싸면 문자열로 취급 (문자 a 와는 다르다)

        System.out.println(true);
            System.out.println(false); //true. 혹은 false 값을 논리형이라고 한다.


        System.out.println("===========================================");

//        System.out.println('');
        System.out.println('a');

    }
}
