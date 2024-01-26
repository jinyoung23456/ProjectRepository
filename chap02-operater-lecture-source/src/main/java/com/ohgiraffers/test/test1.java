package com.ohgiraffers.test;

public class test1 {
    public static void main(String[] args) {

        int sig = 10;
        int saur = 20;

        String result1 = (sig > saur)? "sig" : (sig < saur)? "saur" : "sig";
        System.out.println("sig 와  saur 중 큰수는? : "+ result1);

    }
}
