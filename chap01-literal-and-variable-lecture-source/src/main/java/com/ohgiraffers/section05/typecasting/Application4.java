package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {

        /*필기.  형변환 사용시 주의할 점
         * 데이터 손실에 유의해서 사용해야 한다.
         * */

        /*의도치 않은 데이터 손실*/
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); // 비트 앞부분 손실로 예측 어려움.


        /* 의도한 데이터 손실*/
        double height = 175.7; // 반올림은 하지 않음
        int floorHeiht = (int) height;  // 175

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeiht);



    }
}
