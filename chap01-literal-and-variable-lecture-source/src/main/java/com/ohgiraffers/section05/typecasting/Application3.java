package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {

        /*필기.
         * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
         * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환후 연산 처리 된다.
         * */

        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;
        // 그냥은 안됨. 두 자료형의 연산 결과는  더큰 자료형인 long이 되고 long 형 값은 int 형변수에 담길수 없음


        int isum = inum + (int) lnum; //long형 을 int 형으로 강제 형변환
        System.out.println("isum : " + isum);

        int isum2 = (int) (inum + lnum);// 두수의 연산 결과를 int 형으로 변환한다.
        System.out.println("isum : " + isum2);

        long isum3 = inum + lnum; //결과 값을 long 형 자료형으로 받는다 (자동 형변환 이용)
        System.out.println("isum3 : " + isum3);

        /* 주의 사항. int 미만의 연산처리 결과는 int 형이다.*/
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;


        int result1= byteNum1 + byteNum2;
        int result2= byteNum1 + shortNum1;
        int result3= shortNum1 + byteNum1;
        int result4= shortNum1 + shortNum2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);




    }
}
