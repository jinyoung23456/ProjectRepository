package com.ohgiraffers.test;

public class test5 {

    public static void main(String[] args) {

        int month = 4;
        int day = 4;

        String human = (month <= 6 && day <= 15)? "배민쿠폰" : (month >= 7 && day >= 16)? "스타벅스 커피" : "사탕";

        System.out.println(human);

    }
}
