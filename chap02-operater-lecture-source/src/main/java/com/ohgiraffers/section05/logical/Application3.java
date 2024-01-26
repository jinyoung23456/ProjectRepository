package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* AND 연산과 OR 연산의 특징
         * 논리식 && 논리식 :  결과가 false 이면 뒤를 실행 안함
         *   조건식 두개가 모두 만족해야 true를 반환하기 때문에 앞의 결과가 false가 나오면
         *   뒤의 조건을 확인할 필요 없이 false 를 반환한다.
         *   따라서 연산 횟수를 줄이기 위해서는 앞에 false가 나올 가능성이 높은 조건을 작성한다.
         *
         * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
         *   조건식 하나만 만족해도 true를 반환하기 때문에 앞의 결과가 true가 나오면
         *   뒤의 조건을 확인할 필요 없이 true를 반환한다.
         *   따라서 연산 횟수를 줄이기 위해서는 앞에 true가 나올 가능성이 높은 조건을 작성한다.
         *  */


        int num1 = 10;
        int num14 = 90;

        int result1 = (false && ++num1 > 0) ? num14 : num1; //(조건문)? true실행 값
        // 앞에서 false확인          바로 연산으로 넘어감
        System.out.println("&&실행 결과 : " + result1);

        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("||실행 결과 : " + result2);
    }

}
